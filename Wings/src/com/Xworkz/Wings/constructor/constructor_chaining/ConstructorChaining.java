package com.Xworkz.Wings.constructor.constructor_chaining;

public class ConstructorChaining {
     public static void main(String[] args) {
		Watch watch = new Watch();
		
        Watch fastrack=new Watch("Fastrack",1985.999);
        System.out.println(fastrack.name);
        System.out.println(fastrack.price);
        
        Watch sonata = new Watch("sonata",1599.98,"White","digital");
        System.out.println(sonata.name);
        System.out.println(sonata.price);
        System.out.println(sonata.colour);
        System.out.println(sonata.type);
	}
}
