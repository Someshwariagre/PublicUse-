package com.Xworkz.Wings.string;

public class Stringconcat {
public static void main(String[] args) {
	String a = "web";
	String b = "development";
	String c= "SOMESHWARI AGRE";
	String d = "";
	System.out.println(b=a.concat(b));
	System.out.println(b.charAt(2));
	System.out.println(a.length());
	System.out.println(b.toUpperCase());
	System.out.println(c.toLowerCase());
	System.out.println(c.codePointAt(1));
	System.out.println(c.compareToIgnoreCase(c));
	System.out.println(c.startsWith(c));
	System.out.println(c.isEmpty());
	System.out.println(d.isEmpty());
}
}
