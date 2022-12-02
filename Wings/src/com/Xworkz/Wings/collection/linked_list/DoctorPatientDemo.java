package com.Xworkz.Wings.collection.linked_list;

import java.util.LinkedList;

public class DoctorPatientDemo {
public static void main(String[] args) {
	LinkedList<Doctors> l1 = new LinkedList<Doctors>();
	Doctors drAnita = new Doctors("Jeeva jyoti","Dr.Anita","cardiologist");
	Doctors drArati = new Doctors("ESIC","Dr.Arati","Pediatration");
	Doctors drsantosh = new Doctors("Jaidev","Dr.Santosh","Dentists");
	Doctors drdheeraj = new Doctors("MRMC","Dr.Dheeraj","Physcian");
	
	LinkedList<PatientDetails> l2 = new LinkedList<PatientDetails>();
	PatientDetails smita = new PatientDetails("Smita",34,drAnita);
	PatientDetails sampatti = new PatientDetails("Sampatti",5,drArati);
	PatientDetails soumya = new PatientDetails("Soumya",23,drsantosh);
	PatientDetails rudresh = new PatientDetails("Rudresh",24,drdheeraj);
	PatientDetails rupesh = new PatientDetails("Rupesh",30,drAnita);
	PatientDetails veeresh = new PatientDetails("Veeresh",32,drdheeraj);
	PatientDetails sahana = new PatientDetails("Sahana",35,drAnita);
	PatientDetails harshita = new PatientDetails("Harshita",37,drAnita);
	PatientDetails seema = new PatientDetails("Seema",39,drAnita);
	
	l2.add(rupesh);
	l2.add(rudresh);
	l2.add(soumya);
	l2.add(sampatti);
	l2.add(smita);
	l2.add(seema);
	l2.add(sahana);
	l2.add(veeresh);
	l2.add(harshita);
	
	for(PatientDetails p :l2) {
		if(p.doctors.equals(drAnita)) {
			System.out.println(p);
		}
	}
	
	
	
}
}
