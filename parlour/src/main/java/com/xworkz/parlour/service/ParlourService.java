package com.xworkz.parlour.service;

import java.util.List;

import com.xworkz.parlour.dto.ParlourDto;


public interface ParlourService {

	public boolean onSave(ParlourDto dto);

	public default ParlourDto findById(int id) {
		return null;
	}

	default List<ParlourDto> findByName(String name) {
		return null;
	}
	
	default List<ParlourDto> findAll() {
		return null;
	}
     
	public boolean onUpdate(ParlourDto udto);
	
	public boolean onDelete(int id);

}
