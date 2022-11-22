package com.Xworkz.Wings.array.MultiDimensionArray;

public class SerachStudentDemo {
	public static void main(String[] args) {
		Student smita = new Student("Smita",01,"CSE","PDA");
		Student sampatti = new Student("Sampatti",02,"ISE","Muktambika");
		Student soumya = new Student("Soumya",03,"Civil","PDA");
		Student aishwarya = new Student("Aishwarya",04,"mech","JNMC");
		Student rudresh = new Student("Rudresh",05,"EEE","PDA");
		Student veeresh = new Student("Veeresh",06,"ECE","Gurkul");
		
		Student[] students = {smita,sampatti,soumya,aishwarya,rudresh,veeresh};
		 int count =0;
		 for (int i = 0; i < students.length; i++) {
			 if (students[i].name.equals("Sampatti")) {
				System.out.println("Sampatti Studied in college:-  "  +students[i].collegeName);
				count++;
				 
			 }	
		}
		 if (count==0) {
			 System.out.println("sampatti is not available in the list");
		 }
	}
	}

