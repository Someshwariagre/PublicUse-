package com.Xworkz.Wings.exception.unchecked_exception;

public class Enduser {
public static void main(String[] args) {
	Dmart dmart = new Dmart();
	try {
	dmart.search(new Product("book",30.0));
	
}
	catch(DmartException e) {
		System.out.println(e);
	}
}
}

