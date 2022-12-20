package com.Xworkz.Wings.collection.set.service;

import java.util.HashSet;

import com.Xworkz.Wings.collection.set.exception.HospitalException;
import com.Xworkz.Wings.collection.set.model.HospitalDTO;
import com.Xworkz.Wings.collection.set.repository.HospitalRepository;
import com.Xworkz.Wings.collection.set.repository.HospitalRepositoryIMPL;

public class HospitalServiceIMPL implements HospitalService {
	HospitalRepository hospitalrepository = new HospitalRepositoryIMPL();

	@Override
	public void add(HospitalDTO hospitalDetail) throws HospitalException {
		if(hospitalDetail!=null) {
			hospitalrepository.add(hospitalDetail);
		}
			
			else {
			throw new HospitalException();
		}
		}

	@Override
	public HospitalDTO getHospital(String hospitalName) throws HospitalException {
		HashSet<HospitalDTO> hospitals = hospitalrepository.getHospital();
		HospitalDTO hospitalDetail = null;
		
		for(HospitalDTO hospital :hospitals) {
			if(hospital.getName().equals(hospitalName)) {
				hospitalDetail = hospital;
			}
		}
		
		if(hospitalDetail==null) {
			throw new HospitalException();
			
		}
		return hospitalDetail;
	}
		
	}


