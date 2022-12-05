package com.Xworkz.Wings.collection.linked_list;

public class Doctor {

	String doctorName;
	String Specialist;


	Doctor(String doctorName,String Specialist){
	
		this.doctorName=doctorName;
		this.Specialist=Specialist;
	}
	@Override
	public String toString() {
		return "Doctors [ doctorName=" + doctorName + ", Specialist=" + Specialist + "]";
	}

	}


