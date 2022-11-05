package com.Xworkz.Wings.constructor.constructor_overloading;

public class Medicine {
	String name;
	double price;
	String dose;

	Medicine(){
		System.out.println("I am default constructor");
		name = "vicks";
		price = 34.09;
		dose = "20ml";
	}
	Medicine(String name, double price, String dose){
		System.out.println("I am parameterized constructor");
		this.name = name;
		this.price = price;
		this.dose = dose;
	}
	Medicine(String name, double price){
		this.name=name;
		this.price=price;
		}


}
