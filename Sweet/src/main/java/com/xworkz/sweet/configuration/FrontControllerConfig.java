package com.xworkz.sweet.configuration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	public FrontControllerConfig() {
		System.out.println("Front controller is started");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {BeanConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"}; 

}
}
