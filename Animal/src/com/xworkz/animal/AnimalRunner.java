package com.xworkz.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalRunner {
	
	public static void main(String[] args) {
	ApplicationContext con = new AnnotationConfigApplicationContext(AnimalConfig.class);
	Animal animal = con.getBean(Animal.class);
    animal.eat();
	
	Dog dog = con.getBean(Dog.class);
	dog.bark();
	}

}
