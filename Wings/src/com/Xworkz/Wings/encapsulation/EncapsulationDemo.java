package com.Xworkz.Wings.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Student student = new Student();

		student.setName("Someshwari");
		student.setCollege("PDA engineering college kalburagi");
		student.setUsn("3PD18IP017");

		System.out.println("Student Name is " + student.getName());
		System.out.println("Student USN is " + student.getUsn());
		System.out.println("Stuent College is " + student.getCollege());

	}
}
