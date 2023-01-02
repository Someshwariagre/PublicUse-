package com.Xworkz.Wings.test_programs;

import java.util.Scanner;

public class ReverseString {
//	ans 6):-
	public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter the Word");
	while (true) {
		String s = scr.next();
		String rev = "";
		int leng = s.length();

		for (int i = leng - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println("The reverse of given String is :- " + rev);
	}
}

}
