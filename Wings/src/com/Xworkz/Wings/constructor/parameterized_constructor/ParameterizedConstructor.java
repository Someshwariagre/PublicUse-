package com.Xworkz.Wings.constructor.parameterized_constructor;

public class ParameterizedConstructor {
public static void main(String[] args) {
	Television television= new Television();
	Television sony = new Television("sony",25000.00);
	System.out.println(sony.brand );
	System.out.println(sony.price);
	
	Television higher = new Television("higher",15000.00);
	System.out.println(higher.brand);
	System.out.println(higher.price);
	
	
}
}
