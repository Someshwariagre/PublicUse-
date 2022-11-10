package com.Xworkz.Wings.constructor.constructor_chaining;

public class PlasticTest {
	public static void main(String[] args) {
		Plastic plastic = new Plastic("250gm", "round");
		System.out.println(plastic.weight);
		System.out.println(plastic.shape);

		Waterbottle Milton = new Waterbottle("Milton", "green", 29.18);
		System.out.println("Waterbottle brand is " + Milton.brand);
		System.out.println("Waterbottle colour is" + Milton.colour);
		System.out.println("Waterbottle price is " + Milton.price);

	}
}
