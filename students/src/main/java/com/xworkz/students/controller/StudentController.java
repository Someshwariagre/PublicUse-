package com.xworkz.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.students.entity.StudentDto;
import com.xworkz.students.service.StudentService;

@Controller
@Component
@RequestMapping("/")
public class StudentController {
	public StudentController() {
		System.out.println("Student controller is started");
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private StudentService service;
	
	
	@RequestMapping("/sign")
	public String save(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("email") String email, @RequestParam("password") String password, StudentDto dto, Model model) {
        System.out.println("sign in");
        this.service.save(dto, model);
		StudentDto dto1 = new StudentDto(name, email, password);
        System.out.println(dto);
		return "success";
}
	
	
}
