package com.Xworkz.Wings.collection.set.repository;

import java.util.HashSet;

import com.Xworkz.Wings.collection.set.model.HospitalDTO;

public interface HospitalRepository {
	void add(HospitalDTO hospitalDetails);
	HashSet<HospitalDTO> getHospital();

}
