package com.Xworkz.Wings.string;

public class StringDemo {
public static void main(String[] args) {
	String s1 = "Xworkz";
	String s2 = "Xworkz";
	String s3 = "Java";
	String s4= "Web";
	System.out.println(s1==s2);
	String str=new String("sql");
	String internOfstr=str.intern();
	
	System.out.println(str.equals(internOfstr));
	System.out.println(str==internOfstr);
	
	String str1 = "sql";
	System.out.println(str1==internOfstr);
	
	String str2 = new String ("sql");
	System.out.println(str==str2);
}
}
