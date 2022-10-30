package com.Xworkz.Wings.constructor.constructor_chaining;

public class Watch {
String name;
double price;
String colour;
String type;

Watch(){
	this("fastrack",1985.999);
	System.out.println("I am default constructor");
}
	
	Watch(String name, double price){
		this("sonata",1955.98, "white", "digital");
		System.out.println("I am 2 parameterized constructor");
		this.name=name;
		this.price=price;
	}
	Watch(String name, double price,String colour, String type){
		System.out.println("I am 4 parameterized constructor");
		this.name=name;
		this.price=price;
		this.colour=colour;
		this.type=type;
	}
}

