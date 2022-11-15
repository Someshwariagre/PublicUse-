package com.Xworkz.Wings.type_casting;

public class DownCastingDemo {
public static void main(String[] args) {
	Tree tree = new Mango();
	Mango mango = (Mango) tree;
	mango.ProvideOxygen();
	mango.providesFruit();
}
}
