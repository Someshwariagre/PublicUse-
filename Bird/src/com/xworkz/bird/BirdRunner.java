package com.xworkz.bird;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BirdRunner {

	
	public static void main(String[] args) {
		ApplicationContext context  = new AnnotationConfigApplicationContext(BirdConfigure.class);
		Bird br = context.getBean(Bird.class);
		br.flying();
		
		Peacock pk = context.getBean(Peacock.class);
		pk.feather();
	}
}
