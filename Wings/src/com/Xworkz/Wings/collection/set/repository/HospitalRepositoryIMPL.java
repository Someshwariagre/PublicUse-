package com.Xworkz.Wings.collection.set.repository;

import java.util.HashSet;

import com.Xworkz.Wings.collection.set.model.HospitalDTO;

public class HospitalRepositoryIMPL implements HospitalRepository  {
	
	HashSet<HospitalDTO> hospitals = new HashSet<HospitalDTO>();

	@Override
	public void add(HospitalDTO hospitalDetails) {
		boolean result = hospitals.add(hospitalDetails);
	    if(result)
		System.out.println("hospital details added successfully");
	}

	@Override
	public HashSet<HospitalDTO> getHospital() {
		
		return hospitals;
	}
	
	
	}


