package com.Xworkz.Wings.constructor.constructor_chaining;

public class Waterbottle extends Plastic {
	String brand;
	String colour;
	double price;
	
	Waterbottle(){
		this("Milton","Green", 29.09);
		System.out.println("I am default constructor");
	
		
	}
	Waterbottle(String brand , String colour,double price){
		super("250gm","round");
		System.out.println("I am parameterized constrctor");
		this.brand=brand;
		this.colour=colour;
		this.price=price;
		this.shape=shape;
		this.weight=weight;
		
	}
	
	}
	


