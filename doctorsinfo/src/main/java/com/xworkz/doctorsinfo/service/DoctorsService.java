package com.xworkz.doctorsinfo.service;

import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.doctorsinfo.dto.DoctorsDto;


public interface DoctorsService {
	
	Set<ConstraintViolation<DoctorsDto>> validateAndSave(DoctorsDto dto);

	Set<ConstraintViolation<DoctorsDto>> updateAndSave(DoctorsDto dto);

	default DoctorsDto findById(int id) {
		return null;
	}

	default List<DoctorsDto> findByName(String name) {
		return Collections.emptyList();
	}
	default List<DoctorsDto> findAll() {
		return Collections.emptyList();
	}

	boolean deletById(int id);

}
