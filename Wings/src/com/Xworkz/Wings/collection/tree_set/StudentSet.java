package com.Xworkz.Wings.collection.tree_set;

import java.util.TreeSet;

public class StudentSet {
	public static void main(String[] args) {
		Student someshwari = new Student();
		
		someshwari.setName("Someshwari");

		Student smita = new Student();
		
		smita.setName("Smita");

		Student sam = new Student();
		
		sam.setName("Sam");

		Student aishwarya = new Student();
		
		aishwarya.setName("Aishwarya");

		TreeSet<Student> students = new TreeSet<>(new StudentComparator1());
		students.add(someshwari);
		students.add(sam);
		students.add(smita);
		students.add(aishwarya);

		System.out.println(students);
	}
}
