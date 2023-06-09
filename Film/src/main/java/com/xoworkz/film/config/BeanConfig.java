package com.xoworkz.film.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xoworkz.film")
@EnableWebMvc
public class BeanConfig {
	public BeanConfig() {
		System.out.println("From" + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewresolver() {
		return new InternalResourceViewResolver("/", ".jsp");

	}

	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addRedirectViewController("/", "login");
	}

}
