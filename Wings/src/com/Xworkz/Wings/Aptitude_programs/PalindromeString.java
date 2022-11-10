package com.Xworkz.Wings.Aptitude_programs;

public class PalindromeString {
public static void main(String[] args) {
	String s="madam";
	String rev = "";
	for (int i=s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	if (s.equals(rev)) {
		System.out.println(s+ " is a palindrome sequence");
	}
	else {
		System.out.println(s+ " is not a palindrome sequence");
	}
}
}
