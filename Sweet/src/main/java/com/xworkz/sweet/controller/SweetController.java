package com.xworkz.sweet.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SweetController {
	
	public SweetController() {
		System.out.println("Sweet controller is started");
	}
	@RequestMapping("/signup")
	public String save() {
	  return "signup.jsp";
  }
}
