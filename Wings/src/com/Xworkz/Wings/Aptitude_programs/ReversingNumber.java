package com.Xworkz.Wings.Aptitude_programs;

import java.util.Scanner;

public class ReversingNumber {
	public static void main(String[] args)   
	{ 
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = 1;
		while(num>0) {
			int a = scr.nextInt();
		
		
	int number = a, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	}  
}


