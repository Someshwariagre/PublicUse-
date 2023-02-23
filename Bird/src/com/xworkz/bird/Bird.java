package com.xworkz.bird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bird {
    @Autowired
	private Peacock peacock;
	
	public void flying() {
		System.out.println("Bird is flying");
		
		peacock.feather();
		
	}
}
