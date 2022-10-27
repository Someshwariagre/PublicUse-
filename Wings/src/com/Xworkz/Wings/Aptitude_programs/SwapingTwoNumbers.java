package com.Xworkz.Wings.Aptitude_programs;

public class SwapingTwoNumbers {
	static void swapNumbers(int x, int y)  
	{  
	System.out.println("Before swapping");      
	System.out.println("x= " + x + ", y= " + y);  
	x = x ^ y;  
	y = x ^ y;  
	x = x ^ y;  
	System.out.println("After swapping");  
	System.out.println("x= " + x + ", y= " + y);  
	}  
	public static void main(String[] args)   
	{  
	int x = 12;  
	int y= 34;  
	swapNumbers(x,y);  
	} 
}
