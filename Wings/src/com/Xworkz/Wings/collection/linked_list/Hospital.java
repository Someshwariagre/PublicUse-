package com.Xworkz.Wings.collection.linked_list;

import java.util.LinkedList;

public class Hospital {
String name;
LinkedList<Doctor> doctor;

Hospital(String name,LinkedList<Doctor> doctor){
	this.name=name;
	this.doctor =doctor;
}

@Override
public String toString() {
	return "Hospital [name=" + name + ", doctor=" + doctor + "]";
}

}
