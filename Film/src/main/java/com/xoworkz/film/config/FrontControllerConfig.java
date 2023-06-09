package com.xoworkz.film.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	public FrontControllerConfig() {
		System.out.println("created from" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { BeanConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
