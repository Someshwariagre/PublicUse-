package com.Xworkz.Wings.Aggregation;

public class HasARelationshipDemo1 {
public static void main(String args[]) {
	Human rudra = new Human();
	
	rudra.Age = "55";
	rudra.Gender= "male";
	rudra.heart = new Heart();
	 System.out.println("Human heart beats " + rudra.heart.HeartBeat);
	 System.out.println("Human heart wieghts approximately " + rudra.heart.Wieght);
	
	
}
}
