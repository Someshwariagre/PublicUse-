package com.xworkz.someshwari_project.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.someshwari_project.dto.ProjectDto;
import com.xworkz.someshwari_project.entity.ProjectEntity;
import com.xworkz.someshwari_project.repo.ProjectRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepo userRepositery;
	@Autowired
	private PasswordEncoder passwordEncoder;

	private Set<ConstraintViolation<ProjectDto>> validate(ProjectDto userDto) {
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validationFactory.getValidator();
		Set<ConstraintViolation<ProjectDto>> vailation = validator.validate(userDto);
		return vailation;
	}

	public ProjectServiceImpl() {
		System.out.println("" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ProjectDto>> validateAndSave(ProjectDto userDTO) {
		Long emailCount = this.userRepositery.findByEmail(userDTO.getEmail());
		Long userCount = this.userRepositery.findByUser(userDTO.getUserId());
		Long mobileCount = this.userRepositery.findByMobile(userDTO.getMobile());
		System.out.println("emailCount-" + emailCount);
		System.out.println("userCount-" + userCount);
		System.out.println("mobileCount-" + mobileCount);

		Set<ConstraintViolation<ProjectDto>> violations = validate(userDTO);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("there is Violation in dto");
			return violations;
		}
		if (!userDTO.getPassword().equals(userDTO.getConfirmPassword())) {
			System.out.println("Password is not matching");
			return null;
		}
		if (emailCount == 0 && userCount == 0 && mobileCount == 0) {
			System.out.println("No Violations procceding to save");

			ProjectEntity entity = new ProjectEntity();
			entity.setUserId(userDTO.getUserId());
			entity.setEmail(userDTO.getEmail());
			entity.setMobile(userDTO.getMobile());
			entity.setAgreement(userDTO.getAgreement());
			entity.setCreatedBy(userDTO.getUserId());
			entity.setCreatedDate(LocalDateTime.now());
			entity.setPassword(passwordEncoder.encode(userDTO.getPassword()));
			entity.setResetPassword(false);
			entity.setPasswordChangedTime(LocalTime.of(0, 0, 0));
			// BeanUtils.copyProperties(userDTO, entity);

			boolean saved = this.userRepositery.save(entity);
			System.out.println("Saved in Entity-" + saved);
//
//			if (saved) {
//				boolean sent = this.sendMail(userDTO.getEmail(), "Thanks for registration");
//				System.out.println("Email sent -:" + sent);
//
//			}

		}
		return Collections.emptySet();
	}

	@Override
	public ProjectDto userSignIn(String userId, String password, Model model) {
		ProjectEntity entity = this.userRepositery.getByUser(userId);
		ProjectDto dto = new ProjectDto();
		BeanUtils.copyProperties(entity, dto);
		System.out.println("matching--" + passwordEncoder.matches(password, entity.getPassword()));
		System.out.println("Time matching--" + entity.getPasswordChangedTime().isBefore(LocalTime.now()));
		System.out.println("Now Present Time--" + LocalTime.now());
		System.out.println("PasswordChangedTime--" + entity.getPasswordChangedTime());

//		if (entity.getResetPassword() == true && LocalTime.now().isBefore(entity.getPasswordChangedTime())) {
//			log.info("Running in Time matching");
//			return dto;
//		}

		System.out.println("Time " + LocalTime.now().isBefore(entity.getPasswordChangedTime()));
		if (entity.getLoginCount() >= 3) {
			System.out.println("Running in Login count condition");
			model.addAttribute("emsgs", "Acount lock");
			return dto;
		}

		if (dto.getUserId().equals(userId) && passwordEncoder.matches(password, entity.getPassword())) {
			System.out.println("Running userId matching and password matching");
			return dto;
		} else {
			this.userRepositery.logincount(userId, entity.getLoginCount() + 1);
			System.out.println("count of login" + entity.getLoginCount() + 1);
			return null;
		}
	}

	@Override
	public List<ProjectDto> findAll() {
		List<ProjectEntity> userEntity = this.userRepositery.findAll();
		List<ProjectDto> lists = new ArrayList<ProjectDto>();
		for (ProjectEntity entity : userEntity) {
			ProjectDto dto = new ProjectDto();
			BeanUtils.copyProperties(entity, dto);
			lists.add(dto);

		}
		return lists;
	}

	@Override
	public Long findByEmail(String email) {
		Long emailcount = this.userRepositery.findByEmail(email);
		System.out.println("Find  by Email count");
		return emailcount;
	}

	@Override
	public Long findByMobile(Long mobile) {
		Long mobilecount = this.userRepositery.findByMobile(mobile);
		System.out.println("Find  by mobile count");
		return mobilecount;
	}

	@Override
	public Long findByUser(String user) {
		System.out.println("Find  by user count");
		Long userCount = this.userRepositery.findByUser(user);
		return userCount;
	}

	@Override
	public ProjectDto reSetPassword(String email) {
		System.out.println("Running in reSetPassword");
		String reSetPassword = DefaultPasswordGenerator.generate(6);
		System.out.println("ReSetd password--" + reSetPassword);
		ProjectEntity entity = this.userRepositery.resetPassword(email);
		if (entity != null) {
			System.out.println("entity found for email" + email);
			entity.setPassword(passwordEncoder.encode(reSetPassword));
			entity.setUpdatedBy("System");
			entity.setUpdatedDate(LocalDateTime.now());
			entity.setLoginCount(0);
			entity.setResetPassword(true);
			entity.setPasswordChangedTime(LocalTime.now().plusSeconds(120));
			boolean update = this.userRepositery.update(entity);
//			if (update) {
//				sendMail(entity.getEmail(), "Your  reseted password is-> " + reSetPassword
//						+ "   Plz log in again with in 2 min with this password ");
//			}
			System.out.println("Updated---" + update);
			ProjectDto updatedDto = new ProjectDto();
			BeanUtils.copyProperties(entity, updatedDto);

			return updatedDto;
		}
		System.out.println("entity not found for email" + email);
		return ProjectService.super.reSetPassword(email);
	}

	@Override
	public ProjectDto updatePassword(String userId, String password, String confirmPassword) {
		System.out.println("Running in updating password condition");
		if (password.equals(confirmPassword)) {
			boolean passwordUpdated = this.userRepositery.updatePassword(userId, passwordEncoder.encode(password),
					false, LocalTime.of(0, 0, 0));
			System.out.println("passwordUpdated--" + passwordUpdated);
		}

		return ProjectService.super.updatePassword(userId, password, confirmPassword);
	}

	@Override
	public ProjectDto updateProfile(String userId, String email, Long mobile, String path) {
		ProjectEntity upEntity = this.userRepositery.resetPassword(email);
		System.out.println("userId: " + userId + "email: " + email + "mobile: " + mobile + "image name: " + path);

		upEntity.setUserId(userId);
		upEntity.setMobile(mobile);
		upEntity.setPicName(path);
		boolean updated = this.userRepositery.update(upEntity);
		System.out.println("updated--" + updated);
		return ProjectService.super.updateProfile(userId, email, mobile, path);
	}

//
//	@Override
//	public boolean sendMail(String email, String text) {
//		String portNumber = "587";// 485,587,25
//		String hostName = "smtp.office365.com";
//		String fromEmail = "rudraproject26@outlook.com";
//		String password = "rudra@8088928928";
//		String to = email;
//
//		Properties prop = new Properties();
//		prop.put("mail.smtp.host", hostName);
//		prop.put("mail.smtp.port", portNumber);
//		prop.put("mail.smtp.starttls.enable", true);
//		prop.put("mail.debug", true);
//		prop.put("mail.smtp.auth", true);
//		prop.put("mail.transport.protocol", "smtp");
//
//		Session session = Session.getInstance(prop, new Authenticator() {
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(fromEmail, password);
//			}
//		});
//		MimeMessage message = new MimeMessage(session);
//		try {
//			message.setFrom(new InternetAddress(fromEmail));
//			message.setSubject("Registration  Completed");
//			message.setText(text);
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			Transport.send(message);
//			System.out.println("mail sent sucessfully");
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//		return true;
//	}

	public final static class DefaultPasswordGenerator {
		private static final String[] charCategories = new String[] { "abcdefghijklmnopqrstuvwxyz",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789" };

		public static String generate(int length) {
			StringBuilder password = new StringBuilder(length);
			Random random = new Random(System.nanoTime());

			for (int i = 0; i < length; i++) {
				String charCategory = charCategories[random.nextInt(charCategories.length)];
				int position = random.nextInt(charCategory.length());
				password.append(charCategory.charAt(position));
			}

			return new String(password);
		}
//		String password = DefaultPasswordGenerator.generate(6);[use this reference to generate the password]
	}

}
