package com.Xworkz.Wings.collection.array_list;

import java.util.ArrayList;

public class StudentListDemo {
public static void main(String[] args) {
	ArrayList<Student> students = new ArrayList<Student>();
	Student smita = new Student("Smita" , "s01", "Pda");
	Student someshwari = new Student("Someshwari" , "s02", "Shetty");
	Student sampatti = new Student("Sampatti" , "s03", "KLE");
	Student aishwarya = new Student("Aishwarya" , "a04", "RLS");
	Student rudresh = new Student("Rudresh" , "r05", "Gogate");
	Student basvaraj = new Student("Basvaraj" , "b05", "Gogate");
	Student preeti = new Student("Preeti" , "p06", "Pda");
	
	students.add(basvaraj);
	students.add(preeti);
	students.add(rudresh);
	students.add(aishwarya);
	students.add(sampatti);
	students.add(smita);
	students.add(someshwari);
	
	for(Student s:students) {
		if(!s.college.equals("Pda")) {
		System.out.println(s);	
	}
	}
	System.out.println(students.contains(someshwari));
}
}

