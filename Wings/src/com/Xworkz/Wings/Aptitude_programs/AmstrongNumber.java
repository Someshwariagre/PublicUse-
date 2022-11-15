package com.Xworkz.Wings.Aptitude_programs;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the no for checking amstrong");
		Scanner scr = new Scanner(System.in);

		int num = 1;
		while (num > 0) {

			int no = scr.nextInt();
   
		
		int t1 = no;
		int length = 0;
		int rem;
		while (t1 != 0) {

			t1 = t1 / 10;
			length = length + 1;

		}
		int t2 = no;
		int arm = 0;
		while (t2 != 0) {

			int multi = 1;
			rem = t2 % 10;
			for (int i = 1; i <= length; i++) {

				multi = multi * rem;
			}
			arm = arm + multi;
			t2 = t2 / 10;

		}
		if (arm == no) {
			System.out.println(no + " is Armstrong ");

		} else {
			System.out.println(no + " is not Armstrong ");

		}

	}
}
}
