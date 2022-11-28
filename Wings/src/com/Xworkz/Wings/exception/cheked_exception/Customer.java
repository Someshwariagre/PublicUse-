package com.Xworkz.Wings.exception.cheked_exception;

public class Customer {
public static void main(String[] args) {
	int amount = 1000;
	ATMMachine atm = new ATMMachine();
	try {
	atm.draw(amount);
	}

	catch(AtmException e) {
	if(amount%100!=0) {
		System.out.println(e);
	}
		
	
	else System.out.println(e.getMessage());
}
}
}
