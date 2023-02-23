package com.xworkz.hospital1.service;

import java.util.List;

import com.xworkz.hospital1.dto.HospitalDto;
import com.xworkz.hospital1.repo.Hospital1Repo;
import com.xworkz.hospital1.repo.Hospital1RepoImpl;

public class Hospital1ServiceImpl implements Hospital1Service {
	Hospital1Repo repo = new Hospital1RepoImpl();

	@Override
	public String save(HospitalDto dto) {
		if(dto!=null&& dto.getName().length()>3) {
			System.out.println("data is valid");
			repo.save(dto);
			return "data is valid";
		}
		return null;
	}

	@Override
	public List<HospitalDto> readAll() {
		
		return repo.readAll();
	}

}
