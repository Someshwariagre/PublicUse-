package com.Xworkz.Wings.collection.tree_set;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
	
		return o2.compareTo(o1);
	}

}
