package com.Xworkz.Wings.collection.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;



public class DoctorsListDemo {
	public static void main(String[] args) {
		
		LinkedList<Doctor> doctors = new LinkedList<Doctor>();	
	Doctor drAnita = new Doctor("Dr.Anita","cardiologist");
	Doctor drArati = new Doctor("Dr.Arati","Pediatration");
	Doctor drsantosh = new Doctor("Dr.Santosh","Dentists");
	Doctor drdheeraj = new Doctor("Dr.Dheeraj","Pediatration");
	Doctor drambika = new Doctor("Dr.Ambika","cardiologist");
	Doctor drarun = new Doctor("Dr.Arun","Pediatration");
	Doctor drsarita = new Doctor("Dr.Sarita","Pediatration");
	Doctor drrenuka = new Doctor("Dr.Renuka","Physcian");
	
	
	LinkedList<Doctor> JeevanJyotiHospitalList = new LinkedList<Doctor>();
	JeevanJyotiHospitalList.add(drAnita);
	JeevanJyotiHospitalList.add(drArati);
	
	LinkedList<Doctor> ESIHospitalList = new LinkedList<Doctor>();
	ESIHospitalList.add(drsantosh);
	ESIHospitalList.add(drdheeraj);
	
	LinkedList<Doctor> JaidevHospitalList = new LinkedList<Doctor>();
	JaidevHospitalList.add(drambika);
	JaidevHospitalList.add(drarun);
	
	LinkedList<Doctor> MRMCHospitalList = new LinkedList<Doctor>();
	MRMCHospitalList.add(drrenuka);
	MRMCHospitalList.add(drsarita);
	
	Hospital JeevanJyoti = new Hospital("JeevanJyoti",JeevanJyotiHospitalList );
	Hospital ESI = new Hospital("JeevanJyoti",ESIHospitalList );
	Hospital Jaidev = new Hospital("JeevanJyoti",JaidevHospitalList );
	Hospital MRMC = new Hospital("JeevanJyoti",MRMCHospitalList );
	
	LinkedList<Hospital> hospitalList = new LinkedList<Hospital>();
	hospitalList.add(Jaidev);
	hospitalList.add(ESI);
	hospitalList.add(JeevanJyoti);
	hospitalList.add(MRMC);
	
	
	
	
	ListIterator<Hospital> itr = hospitalList.listIterator();
	
	for(Hospital h : hospitalList) {
  if (h.doctor.equals("Pediatrition"));
  System.out.println(h);
	
		}
	}
	}
	
	
	
	
