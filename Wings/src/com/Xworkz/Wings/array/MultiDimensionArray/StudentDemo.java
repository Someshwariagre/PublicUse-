package com.Xworkz.Wings.array.MultiDimensionArray;

public class StudentDemo {
	public static void main(String[] args) {
		Student smita = new Student("Smita", 01, "CSE", "PDA");
		Student sampatti = new Student("Sampatti", 02, "ISE", "Muktambika");
		Student soumya = new Student("Soumya", 03, "Civil", "PDA");
		Student aishwarya = new Student("Aishwarya", 04, "mech", "JNMC");
		Student rudresh = new Student("Rudresh", 05, "EEE", "PDA");
		Student veeresh = new Student("Veeresh", 06, "ECE", "Gurkul");

		Student[] students = { smita, sampatti, soumya, aishwarya, rudresh, veeresh };

		for (int i = 0; i < students.length; i++) {
			if (students[i].collegeName.equals("PDA")) {
				System.out.println(students[i].toString());

				
			}

		}
	}
}
