package com.Xworkz.Wings.array.MultiDimensionArray;

public class Student {
String name;
int rollno;
String branch;
String collegeName;

 Student(String name,int rollno, String branch,String collegeName){
	 this.name=name;
	 this.rollno=rollno;
	 this.branch=branch;
	 this.collegeName=collegeName;
	 
 }

public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", branch=" + branch + ", collegeName=" + collegeName + "]";
}


 
}
