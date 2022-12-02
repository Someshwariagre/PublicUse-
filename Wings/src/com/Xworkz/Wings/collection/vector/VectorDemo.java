package com.Xworkz.Wings.collection.vector;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add('a');
	v.add('e');
	v.add('i');
	v.add('o');
	v.add('u');
	System.out.println(v);
	
	v.add(1, 's');
	System.out.println(v);
	System.out.println(v.elementAt(2));
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	System.out.println(v.remove(3));
	System.out.println(v.retainAll(v));
	v.clear();
	System.out.println(v);
	
}
}
