package com.Xworkz.Wings.Aptitude_programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the no for checking palindrom");
		Scanner scr = new Scanner(System.in);

		int num = 1;
		while (num > 0) {

			int temp1 = scr.nextInt();
			int no = temp1;
			int temp = no;
			int rev = 0, rem;
			while (temp != 0)

			{
				rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;
			}
			if (no == rev) {
				System.out.println(no + " is palindrome number");
			} else {
				System.out.println(no + " is not palindrome number");
			}
		}

	}

}
