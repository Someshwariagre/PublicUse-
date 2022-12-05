package com.Xworkz.Wings.collection.array_list;

import java.util.ArrayList;

public class Trainer {
	String name;
	ArrayList<StudentDetails> Student;

	Trainer(String name, ArrayList<StudentDetails> Student) {
		this.name = name;
		this.Student = Student;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", Student=" + Student + "]";
	}
}
