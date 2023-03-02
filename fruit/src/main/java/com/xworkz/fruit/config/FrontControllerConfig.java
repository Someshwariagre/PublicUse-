package com.xworkz.fruit.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running in getrootconfig");
		return new Class[] { BeanConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
//		System.out.println("running in getServletConfigClasses");
//		return new Class[] { BeanConfig.class };
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running in servaletMapping");
		return new String[] { "/" };
	}

}
