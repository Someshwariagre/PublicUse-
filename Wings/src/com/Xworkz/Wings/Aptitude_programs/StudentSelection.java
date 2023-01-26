package com.Xworkz.Wings.Aptitude_programs;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSelection {
	  public static void main(String[] args) {
	        List<String> studentNames = Arrays.asList("Hareshi", "Mitesh", "Prashant");
	        selectStudents(studentNames);
	    }

	    public static void selectStudents(List<String> studentNames) {
	        if(studentNames.size() < 1 || studentNames.get(0).length() < 2) {
	            System.out.println("Missing required inputs.");
	            return;
	        }

	        List<String> selectedStudents = studentNames.stream()
	                .filter(name -> name.endsWith("sh"))
	                .collect(Collectors.toList());

	        selectedStudents.forEach(System.out::println);
	    }

}
