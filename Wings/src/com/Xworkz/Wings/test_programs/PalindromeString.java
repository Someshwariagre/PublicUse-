package com.Xworkz.Wings.test_programs;

import java.util.Scanner;

public class PalindromeString {
	// ans 13)
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String");
		
		
		while (true) {
			String s = scr.next();
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
	}


