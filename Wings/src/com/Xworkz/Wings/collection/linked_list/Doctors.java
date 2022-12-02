package com.Xworkz.Wings.collection.linked_list;

public class Doctors {
String Hospitalname;
String doctorName;
String Specialist;


Doctors(String Hospitalname,String doctorName,String Specialist){
	this.Hospitalname=Hospitalname;
	this.doctorName=doctorName;
	this.Specialist=Specialist;
}
@Override
public String toString() {
	return "Doctors [Hospitalname=" + Hospitalname + ", doctorName=" + doctorName + ", Specialist=" + Specialist + "]";
}

}
