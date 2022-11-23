package com.Xworkz.Wings.string.string_buffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("chair");
		StringBuffer s2 = new StringBuffer("fan");
		System.out.println(s1 == s2);

		System.out.println(s1.reverse());

		System.out.println(s1);

		System.out.println(s1.capacity());
		
		System.out.println(s2.capacity());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.append(s2));
		
		System.out.println(s1.delete(2, 4));
		
		System.out.println(s2.lastIndexOf("chair"));
		
		System.out.println(s2.insert(2, "f"));
		
		System.out.println(s2.replace(2, 3, "d"));
		
		System.out.println(s2);
	}
}
