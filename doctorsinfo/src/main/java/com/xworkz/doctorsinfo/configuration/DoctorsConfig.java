package com.xworkz.doctorsinfo.configuration;



import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;


@Configuration
@ComponentScan("com.xworkz.doctorsinfo")
@Slf4j
public class DoctorsConfig {
	
	public DoctorsConfig() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Bean
	public MultipartResolver multipartResolver() {
		System.out.println("Running in multipartResolver");
		return new StandardServletMultipartResolver();
	}

	@Bean
	@Order(1)
	public ViewResolver viewResolver() {
		return new InternalResourceViewResolver("/",".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		return new LocalContainerEntityManagerFactoryBean();
	}

}
