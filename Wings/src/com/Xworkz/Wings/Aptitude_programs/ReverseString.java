package com.Xworkz.Wings.Aptitude_programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the name");
		while (true) {
			String name = scr.next();
			String rev = "";
			int leng = name.length();

			for (int i = leng - 1; i >= 0; i--) {
				rev = rev + name.charAt(i);

			}
			System.out.println("The reverse of given String is :- " + rev);
		}
	}
}
