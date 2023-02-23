package com.xworkz.hospital1.service;

import java.util.List;

import com.xworkz.hospital1.dto.HospitalDto;

public interface Hospital1Service {
	
	public String save(HospitalDto dto);
	
	public List<HospitalDto> readAll();

}
