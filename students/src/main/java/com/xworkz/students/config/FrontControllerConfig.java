package com.xworkz.students.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
public FrontControllerConfig() {
	System.out.println("Front controller is started");
	// TODO Auto-generated constructor stub
}
	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { BeanConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { BeanConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}
}
