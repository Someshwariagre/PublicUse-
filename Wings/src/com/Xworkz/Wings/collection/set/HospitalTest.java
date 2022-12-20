package com.Xworkz.Wings.collection.set;

import java.util.HashSet;

import com.Xworkz.Wings.collection.set.exception.HospitalException;
import com.Xworkz.Wings.collection.set.model.DoctorDTO;
import com.Xworkz.Wings.collection.set.model.HospitalDTO;
import com.Xworkz.Wings.collection.set.service.HospitalService;
import com.Xworkz.Wings.collection.set.service.HospitalServiceIMPL;

public class HospitalTest {
public static void main(String[] args) {
	HospitalService hospitalservice = new HospitalServiceIMPL();
	
	DoctorDTO someshwari = new DoctorDTO();
	someshwari.setName("Someshwari");
	someshwari.setSpecailization("Dentist");
	HashSet<DoctorDTO> jeevanjyotidoctors = new HashSet<DoctorDTO>();
	jeevanjyotidoctors.add(someshwari);
	
	DoctorDTO sampatti = new DoctorDTO();
	sampatti.setName("Sampatti");
	sampatti.setSpecailization("Cardiologist");
	HashSet<DoctorDTO> ESIdoctors = new HashSet<DoctorDTO>();
	ESIdoctors.add(sampatti);
	
	
	HospitalDTO jeevanjyoti = new HospitalDTO();
	jeevanjyoti.setName("Jeevanjyoti");
	jeevanjyoti.setDoctors(jeevanjyotidoctors);
	
	HospitalDTO jeevanjyoti1 = new HospitalDTO();
	jeevanjyoti1.setName("Jeevanjyoti");
	jeevanjyoti1.setDoctors(jeevanjyotidoctors);
	
	HospitalDTO esi = new HospitalDTO();
	esi.setName("ESI");
	esi.setDoctors(ESIdoctors);
	
	try {
		hospitalservice.add(esi);
		hospitalservice.add(jeevanjyoti);
		hospitalservice.add(jeevanjyoti1);
	}
	catch (HospitalException e) {
		System.out.println(e);
	}
	
	try {
		HospitalDTO jeevanjyotihospital = hospitalservice.getHospital("Jeevanjyoti");
		System.out.println("details of Jeevanjyoti : "+jeevanjyotihospital);
		HospitalDTO esihospital = hospitalservice.getHospital("ESI");
		System.out.println("details of ESI : "+esihospital);
	}
	catch (HospitalException e) {
	System.out.println(e.getMessage());		
	}
}
}
