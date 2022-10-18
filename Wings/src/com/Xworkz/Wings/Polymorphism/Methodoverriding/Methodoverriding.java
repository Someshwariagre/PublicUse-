package com.Xworkz.Wings.Polymorphism.Methodoverriding;

public class Methodoverriding {
public static void main(String[] args) {
	RBI rbi = new RBI();
	HDFC hdfc = new HDFC ();
	Canara canara = new Canara();
	rbi.getIntrestRate();
	hdfc.getIntrestRate();
	canara.getInterestRate();
	}
}
