package com.xworkz.somu_project.controller;

import java.util.List;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.somu_project.dto.ProjectDto;
import com.xworkz.somu_project.service.ProjectService;
import com.xworkz.somu_project.service.ProjectServiceImpl;

@Controller
@RequestMapping("/")
public class ProjectController {
	public ProjectController() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Autowired
	private ProjectService service;

	@GetMapping("/save")
	public String save(Model model, ProjectDto dto) {
		Set<ConstraintViolation<ProjectDto>> save = this.service.save(dto);
		if (save != null && save.isEmpty()) {
			model.addAttribute("msg", "Logged in Successfully");
		}
		model.addAttribute("save", save);
		return "signUp";
	}

	@PostMapping("/login")
	public String signIn(String name, String password, Model model) {
		ProjectDto input = this.service.login(name, password);

		if (input != null && password.equals(password)) {
			System.out.println(input);

			model.addAttribute("input", input);
			return "Success";
		}

		model.addAttribute("msg", "User id or password does not match");
		return "signIn";
	}
}

//	@PostMapping("/otp")
//	public String loginWithOtp(String name,String otp,Model model) {
//		ProjectDto user = this.service.login(name, otp);
//		if(user!=null&&service.isOtpValid(user, otp)) {
//		model.addAttribute("user",user);
//		return "signIn";
//		}else {
//			model.addAttribute("error","Invalid OTP");
//			return "signIn";
//		}
//	}		
