package com.Xworkz.Wings.collection.tree_set;

import java.util.TreeSet;

public class TreeSetWithStringBuffer {
	public static void main(String[] args) {
		
	
  TreeSet<StringBuffer> birds = new TreeSet<>(new StringBufferComparator());
  birds.add(new StringBuffer("parrot"));
  birds.add(new StringBuffer("peacock"));
  birds.add(new StringBuffer("pigeon"));
  birds.add(new StringBuffer("butterfly"));
  birds.add(new StringBuffer("sparrow"));
  System.out.println(birds);
  
}
}
