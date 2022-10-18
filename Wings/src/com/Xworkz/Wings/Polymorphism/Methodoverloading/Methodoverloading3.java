package com.Xworkz.Wings.Polymorphism.Methodoverloading;

public class Methodoverloading3 {
public static void main(String[] args) {
	Bags skybags = new Bags();
	School school = new School();
	Trip trip = new Trip();
	skybags.Carry(school);
	skybags.Carry(trip);
	
	
}
}
