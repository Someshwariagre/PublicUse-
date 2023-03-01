package com.xworkz.sweet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.sweet.controller.SweetController;
@Configuration
@ComponentScan("com.xworkz.sweet")
@EnableWebMvc
public class BeanConfiguration implements WebMvcConfigurer{
	public BeanConfiguration() {
		System.out.println("Bean configuration is started");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addRedirectViewController("/", "Home.jsp");
	}
	
//	@Bean 
//	public SweetController getSweetController() {
//		return new SweetController();
//	}
	

}
