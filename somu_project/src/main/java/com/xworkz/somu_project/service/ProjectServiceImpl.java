package com.xworkz.somu_project.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.Constraint;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.somu_project.dto.ProjectDto;
import com.xworkz.somu_project.entity.ProjectEntity;
import com.xworkz.somu_project.repo.ProjectRepo;

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

@Service
public class ProjectServiceImpl implements ProjectService {
	
//	private static final int MAX_LOGIN_ATTEMPTS = 3;
//	private static final int OTP_EXPIRATION_TIME = 3 * 60 * 1000;

	public ProjectServiceImpl() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Autowired
	private ProjectRepo repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Set<ConstraintViolation<ProjectDto>> save(ProjectDto dto) {
		Long emailCount = repo.findByEmail(dto.getEmail());
		ProjectEntity userCount = repo.findByName(dto.getName());
		Long mobileCount = repo.findByMobile(dto.getMobile());
		System.out.println("emailCount-" + emailCount);
		System.out.println("userCount-" + userCount);
		System.out.println("mobileCount-" + mobileCount);

		Set<ConstraintViolation<ProjectDto>> violations = save(dto);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("there is Violation in dto");
			return violations;
		}
		if (!dto.getPassword().equals(dto.getConfirmPassword())) {
			System.out.println("Password is not matching");
			return null;
		}
		if (emailCount == 0 && userCount == 0 && mobileCount == 0) {
			System.out.println("No Violations procceding to save");

			ProjectEntity entity = new ProjectEntity();
			entity.setName(dto.getName());
			entity.setEmail(dto.getEmail());
			entity.setMobile(dto.getMobile());
			
		
			entity.setCreatedDate(LocalDateTime.now());
			entity.setPassword(passwordEncoder.encode(userDTO.getPassword()));
			entity.setResetPassword(false);
			entity.setPasswordChangedTime(LocalTime.of(0, 0, 0));
			// BeanUtils.copyProperties(userDTO, entity);

			boolean saved = this.userRepositery.save(entity);
			log.info("Saved in Entity-" + saved);

			if (saved) {
				boolean sent = this.sendMail(userDTO.getEmail(), "Thanks for registration");
				log.info("Email sent -:" + sent);

			}

		}
		return Collections.emptySet();

	@Override
	public ProjectDto login(String name, String password) {
		ProjectEntity lentity = this.repo.findByName(name);
		ProjectDto ldto = new ProjectDto();
			BeanUtils.copyProperties(lentity, ldto);
		
			if (lentity.getName().equals(name) && lentity.getPassword().equals(password)) {
				System.out.println(lentity);
				return ldto;

			}
			
		return null;
	}
	
	@Override
	public List<ProjectDto> findAll() {
		List<ProjectEntity> userEntity = repo.findAll();
		List<ProjectDto> lists = new ArrayList<ProjectDto>();
		for (ProjectEntity entity : userEntity) {
			ProjectDto dto = new ProjectDto();
			BeanUtils.copyProperties(entity, dto);
			lists.add(dto);

		}
		return lists;
	}

//	@Override
//	public void incrementFailedLoginAttempts(String name) {
//		ProjectEntity entity = repo.findByName(name);
//		ProjectDto dto = new ProjectDto();
//		
//		if(dto!=null) {
//			int currentAttempts = dto.getFailedLoginAttempts()!=null? dto.getFailedLoginAttempts():0;
//			dto.setFailedLoginAttempts(currentAttempts+1);
//			repo.save(entity);
//		}
//		
//		
//	}
//
//	@Override
//	public boolean isAccountLocked(String name) {
//		ProjectEntity entity = repo.findByName(name);
//		ProjectDto dto = new ProjectDto();
//		
//		
//		return dto!=null&& dto.getFailedLoginAttempts()!=null && entity.getFailedLoginAttempts()>=3;
//	}
//
//	@Override
//	public void resetFailedLoginAttempts(String name) {
//		ProjectEntity entity = repo.findByName(name);
//		ProjectDto dto = new ProjectDto();
//		
//		if(dto!=null&&dto.getFailedLoginAttempts()!=null);
//		dto.setFailedLoginAttempts(0);
//		repo.save(entity);
//		
//	}
//	
	

//	private static final int MAX_LOGIN_ATTEMPTS = 3;
//	private static final int OTP_EXPIRATION_TIME = 3 * 60 * 1000;
//
//	@Override
//	public void lockAccount(ProjectDto dto) {
//		ProjectEntity pe = new ProjectEntity();
//		BeanUtils.copyProperties(dto, pe);
//		dto.setIsLocked(true);
//		repo.save(pe);
//		return;
//	}
//
//	@Override
//	public boolean isAccountLocked(ProjectDto dto) {
//		
//		return dto.IsLocked();
//	}
//
//	@Override
//	public boolean isOtpValid(ProjectDto dto, String otp) {
//		if(dto.getMobile().equals(otp)) {
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	public ProjectDto signIn(String name, String password) {
//		ProjectEntity entity = (ProjectEntity) repo.findByName(name);
//		ProjectDto dto = new ProjectDto();
//		BeanUtils.copyProperties(dto, entity);
//
//		
//		if (isAccountLocked(dto)) {
//			return null;
//		}
//
//		if (dto.getPassword().equals(password)) {
//			dto.setLoginAttempts(0);
////			repo.save(entity);
//			return dto;
//
//		}else {
//			int loginAttempts= dto.getLoginAttempts();
//			loginAttempts++;
//			dto.setLoginAttempts(loginAttempts);
//			repo.save(entity);
//			
//			if(loginAttempts>=MAX_LOGIN_ATTEMPTS) {
//				lockAccount(dto);
//			}
//		}
//		return null;
//	}
}
