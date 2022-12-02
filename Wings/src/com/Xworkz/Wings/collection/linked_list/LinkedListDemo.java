package com.Xworkz.Wings.collection.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(1);
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(null);
	System.out.println(ll);
	
	ArrayList list = new ArrayList(ll);
	list.add(6);
	System.out.println(ll);
	ll.add(7);
	System.out.println(ll);
	
	}
}
