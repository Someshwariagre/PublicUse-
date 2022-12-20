package com.Xworkz.Wings.collection.tree_set;

import java.util.TreeSet;

public class TreeSetWithString {
public static void main(String[] args) {
	TreeSet ts = new TreeSet(new StringComparator());
	ts.add("apple");
	ts.add("banana");
	ts.add("dog");
	ts.add("cat");
	ts.add("duck");
	System.out.println(ts);
			
	}
}
