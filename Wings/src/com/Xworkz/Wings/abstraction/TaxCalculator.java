package com.Xworkz.Wings.abstraction;

public class TaxCalculator implements StateTax, CentralTax{

	public void electricityTax() {
		System.out.println("Electricity Tax is 200Rs");
		
	}

	public void incomeTax() {
		System.out.println("Income Tax is 2000Rs");
		
	}
}

