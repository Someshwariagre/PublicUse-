package com.Xworkz.Wings.final_keyword;

public class FinalKWC {
	 int add(){
		 final int a = 10;
		 final int b = 20;
		 return a+b;
	 }
	 FinalKWC(){
		 int a = 30;
		 int b = 40;
	 }

	 
	 public static void main(String[] args) {
		 FinalKWC fk = new FinalKWC();
		System.out.println(fk.add());
		  
	}

}
