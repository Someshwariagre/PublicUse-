package com.Xworkz.Wings.object_class_methods.string_to_string;

public class Animal {
	String name;
	String type;

	
	public Animal(String name,String type){
		this.name=name;
		this.type=type;
		
	}
	public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
