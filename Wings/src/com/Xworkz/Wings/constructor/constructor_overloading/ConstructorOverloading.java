package com.Xworkz.Wings.constructor.constructor_overloading;

public class ConstructorOverloading {
	public static void main(String[] args) {
		Medicine medicine = new Medicine();
		
	Medicine paracetemol = new Medicine("paracetemol",20.12,"50mg");
	System.out.println(paracetemol.name);
	System.out.println(paracetemol.price);
	System.out.println(paracetemol.dose);
	
	Medicine dolo = new Medicine("dolo",25.10);
	System.out.println(dolo.name);
	System.out.println(dolo.price);
		
		
	
		
	}

 
}
