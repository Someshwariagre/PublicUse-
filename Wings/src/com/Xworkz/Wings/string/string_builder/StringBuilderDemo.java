package com.Xworkz.Wings.string.string_builder;

public class StringBuilderDemo {
	public static void main(String[] args) {

		StringBuilder s1 = new StringBuilder("laptop");
		StringBuilder s2 = new StringBuilder("charger");
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s1.reverse());
		
		System.out.println(s2.capacity());
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s2.insert(1, "w"));
		
		System.out.println(s2);
		
		System.out.println(s1);
	}
}
