package com.Xworkz.Wings.Polymorphism.Methodoverloading;

public class Methodoverloading {
public static void main(String[] args) {
	Human someshwari = new Human();
	Unknown unknown = new Unknown();
	Friend friend = new Friend();
	 someshwari.Speak(unknown);
	 someshwari.Speak(friend);
	 
	
}
}
