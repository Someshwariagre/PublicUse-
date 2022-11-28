package com.Xworkz.Wings.exception.unchecked_exception;

public class Dmart {
int[] arr = {1,2,3,4};

Product[] products = {new Product("soap",25.00),
		              new Product("paste",20.00),
		              new Product("brush",15.00),
		              new Product("perfume",70.00),
		              new Product("shampoo",2.00)};

void search(Product product) {		
boolean isProductAvailable = false;
 for(int i =0; i<products.length; i++) {
	 if(products[i].equals(product)) {
		 isProductAvailable=true;
	 }
 }
 if(isProductAvailable) {
	 System.out.println("product found..");
	 }
 else {
	 throw new DmartException();
 }
 }
}
