package com.Xworkz.Wings.collection.linked_list;

public class PatientDetails {
String name;
int age;
Doctors doctors;
PatientDetails(String name,int age,Doctors doctors){
	this.name=name;
	this.age=age;
	this.doctors=doctors;
}
@Override
public String toString() {
	return "PatientDetails [name=" + name + ", age=" + age + ", doctors=" + doctors + "]";
}

}

