package com.Xworkz.Wings.final_keyword;

public class FinalKeyword {
	public static void main(String[] args) {
		FinalKeyword fk= new FinalKeyword();
		System.out.println(fk.add());
	}
	int add() {
 final int a=10;
 final int b=20;
   return a+b;
	}     
}
