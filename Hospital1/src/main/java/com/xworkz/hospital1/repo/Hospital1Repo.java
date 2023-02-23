package com.xworkz.hospital1.repo;

import java.util.List;

import com.xworkz.hospital1.dto.HospitalDto;

public interface Hospital1Repo {
	
	public String save(HospitalDto dto);
	
	public List<HospitalDto> readAll();
	

	

}
