package com.Xworkz.Wings.constructor.parameterized_constructor;

public class Television {
String brand;
double price;

Television(){
	System.out.println("I am default constructor");
	
}
Television(String brand,double price ){
	System.out.println("I am parameterized constructor");
	this.brand=brand;
	this.price = price;
	
}
}

