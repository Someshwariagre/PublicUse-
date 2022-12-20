package com.Xworkz.Wings.collection.set.service;

import com.Xworkz.Wings.collection.set.exception.HospitalException;
import com.Xworkz.Wings.collection.set.model.HospitalDTO;

public interface HospitalService {
	void add(HospitalDTO hospitalDetail) throws HospitalException;
    HospitalDTO getHospital(String hospitalName) throws HospitalException ;
}
