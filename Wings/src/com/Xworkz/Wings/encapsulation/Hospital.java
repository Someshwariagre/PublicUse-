package com.Xworkz.Wings.encapsulation;

public class Hospital {
private String name;
private String type;
private int NoOfDoctors;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getNoOfDoctors() {
	return NoOfDoctors;
}
public void setNoOfDoctors(int noOfDoctors) {
	NoOfDoctors = noOfDoctors;
}
public int getNoOPatients() {
	return NoOPatients;
}
public void setNoOPatients(int noOPatients) {
	NoOPatients = noOPatients;
}
private int NoOPatients;



}
