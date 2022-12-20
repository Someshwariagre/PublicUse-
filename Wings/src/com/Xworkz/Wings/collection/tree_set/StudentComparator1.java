package com.Xworkz.Wings.collection.tree_set;

import java.util.Comparator;


public class StudentComparator1 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
			return o1.getName().compareTo(o2.getName());
		    	
	}
	
}
	


