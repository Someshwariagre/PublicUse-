package com.Xworkz.Wings.collection.array_list;

public class StudentDetails {
String name;
String batchNumber;
String qualification;
String trainerName;

StudentDetails(String name, String batchNumber,String qualification,String trainerName){
	this.name= name;
	this.batchNumber=batchNumber;
	this.qualification=qualification;
	this.trainerName=trainerName;
	
}

@Override
public String toString() {
	return "StudentDetails [name=" + name + ", batchNumber=" + batchNumber + ", qualification=" + qualification
			+ ", trainerName=" + trainerName + "]";
}

}
