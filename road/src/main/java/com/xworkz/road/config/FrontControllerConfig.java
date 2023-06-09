package com.xworkz.road.config;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@EnableWebMvc
public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	public FrontControllerConfig() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running in FrontControllerConfig");
		return new Class[] { BeanConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running in FrontControllerConfig");
		return new Class[] { BeanConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running in FrontControllerConfig");
		return new String[] { "/" };
	}

}
