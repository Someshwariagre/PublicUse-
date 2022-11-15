package com.Xworkz.Wings.Aptitude_programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		
		
		while (true) {
			int a = scr.nextInt();
			int number=a;
			int fact = 1;

			for (int i = 1; i <= number; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + number + " is: " + fact);
		}
	}
}
