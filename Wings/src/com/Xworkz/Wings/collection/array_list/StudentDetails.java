package com.Xworkz.Wings.collection.array_list;

public class StudentDetails {
String name;
String batchNumber;
String qualification;


StudentDetails(String name, String batchNumber,String qualification ){
	this.name= name;
	this.batchNumber=batchNumber;
	this.qualification=qualification;
	
	
}


@Override
public String toString() {
	return "StudentDetails [name=" + name + ", batchNumber=" + batchNumber + ", qualification=" + qualification + "]";
}
}
