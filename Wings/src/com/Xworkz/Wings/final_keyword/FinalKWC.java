package com.Xworkz.Wings.final_keyword;

public class FinalKWC {
	 int add(){
		 final int A = 30;
		 final int B = 40;
		 return A+B;
	
	
	 }
          FinalKWC(){
		final int A = 50;
		final int B = 60;
		 
	 }
        
      	 
	 
	 public static void main(String[] args) {
		 FinalKWC fk = new FinalKWC();
		System.out.println(fk.add());
		  
	}

}
