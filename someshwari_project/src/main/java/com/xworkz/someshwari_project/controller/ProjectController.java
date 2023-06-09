package com.xworkz.someshwari_project.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.someshwari_project.dto.ProjectDto;
import com.xworkz.someshwari_project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class ProjectController {

	@Autowired
	private ProjectService service;

	public ProjectController() {
		System.out.println("" + this.getClass().getSimpleName());
	}

	@PostMapping("/save")
	public String userInfo(ProjectDto dto, Model model) {
		Set<ConstraintViolation<ProjectDto>> violations = service.validateAndSave(dto);

		if (violations != null && violations.isEmpty() && dto != null) {
			model.addAttribute("message", "Registration sucessfull");
			System.out.println("Running in no violations condition ");
			System.out.println("" + dto);
			return "signUp";
		}
		model.addAttribute("errors", violations);
		model.addAttribute("messag", "Registration failed");
		model.addAttribute("dto", dto);
		System.out.println("Running in  violations condition ");
		return "signUp";

	}

	@PostMapping("/signin")
	public String userSignIn(String userId, String password, Model model, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		System.out.println("Running in userSignIn condition ");
		try {
			ProjectDto uudto = this.service.userSignIn(userId, password,model);
			System.out.println("Login count" + uudto.getLoginCount());
			if (uudto.getLoginCount() >= 3) {
				model.addAttribute("msg", "Account locked Reset password");
				System.out.println("Acount locked due to wrong password entering 3 times");
				return "SignIn";
			}
			if (uudto != null) {

				if (uudto.getResetPassword() == true) {
					System.out.println("Running in ResetPassword true condition");
					if (!uudto.getPasswordChangedTime().isAfter(LocalTime.now())) {
						System.out.println("Running in time varifying condition");
						model.addAttribute("msgs", "Time out plz try again");
						return "SignIn";
					}
					model.addAttribute("userID", uudto.getUserId());
					System.out.println("Running in reset condition");
					System.out.println("ResetPassword---" + uudto.getResetPassword());
					System.out.println("Timer-----" + uudto.getPasswordChangedTime().isBefore(LocalTime.now()));
					return "updatePassword";
				}
				System.out.println("User ID and password is matched");
				// model.addAttribute("userID", udto.getUserId());//request scope
				HttpSession httpSession = request.getSession(true);
				httpSession.setAttribute("userID", uudto.getUserId());
				if (uudto.getPicName() != null) {
					httpSession.setAttribute("dtoPic", uudto.getPicName());
				}
				httpSession.setAttribute("udto", uudto);
				return "LoginSucess";
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("UserID OR Password is not matching");
		model.addAttribute("match", "UserID OR Password is not matching");
		return "SignIn";

	}

	@PostMapping("/reset")
	public String reSetPassword(String email, Model model) {
		try {
			ProjectDto udto = this.service.reSetPassword(email);
			if (udto.getResetPassword() == true) {
				System.out.println("Password reset sucessful plz login with in 2 min with otp");
				model.addAttribute("msg", "Password reset sucessful plz login with in 2 min with otp");
				return "resetpassword";
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return "resetpassword";

	}

	@PostMapping("/passwordUpdate")
	public String upDatePassword(String userId, String password, String confirmPassword) {
		System.out.println("Running in upDatePassword method");
		this.service.updatePassword(userId, password, confirmPassword);
		return "SignIn";
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("chitra") MultipartFile multipartFile, String userId, String email,
			Long mobile, Model model) throws IOException {
		System.out.println("multipartFile" + multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println("Size of file" + multipartFile.getSize());
		System.out.println("Size of bite" + multipartFile.getBytes());
		if (multipartFile.isEmpty()) {
			System.out.println("file not uploaded");
			model.addAttribute("error", "please select file");
			return "profileUpdate";
		}
		String imageFormat = multipartFile.getOriginalFilename().substring(
				multipartFile.getOriginalFilename().lastIndexOf('.'), multipartFile.getOriginalFilename().length());
		System.out.println("Image last form" + imageFormat);
		model.addAttribute("sucess", "image uploaded sucessfully");
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("D:\\temp\\" + userId + System.currentTimeMillis() + imageFormat);
		Files.write(path, bytes);
		String imageName = path.getFileName().toString();
		System.out.println("Image name--" + imageName);
		System.out.println("Image name in tostring--" + path.toString());
		System.out.println("Image file name--" + path.getFileName());
		this.service.updateProfile(userId, email, mobile, imageName);
		return "profileUpdate";
	}

	@GetMapping("/download")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName, ProjectDto user)
			throws IOException {
		try {
			Path path = Paths.get("D:\\temp\\" + user.getPicName());
			path.toFile();
			response.setContentType("image/jpeg");
			File file = new File("D:\\somu\\" + fileName);
			InputStream in = new BufferedInputStream(new FileInputStream(file));
			ServletOutputStream out = response.getOutputStream();
			IOUtils.copy(in, out);
			response.flushBuffer();
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}
	}
}
