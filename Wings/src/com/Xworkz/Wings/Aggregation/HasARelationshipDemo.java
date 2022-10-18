package com.Xworkz.Wings.Aggregation;

public class HasARelationshipDemo {
public static void main(String args[]) {
	Library sharada = new Library();
	
	sharada.name = "sharada";
	sharada.NoOfBooks = 250;
	sharada.Location = "Gulbaraga";
	sharada.student = new Student();
	
	System.out.println("Student name : "+ sharada.student.Name);
	System.out.println("Student Id : "+ sharada.student.id);
	System.out.println("Student college : "+ sharada.student.college);

	
	}
}
