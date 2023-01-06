package com.xworkz.television.service;

import java.util.ArrayList;


import com.xworkz.television.DTO.TelevisionDTO;
import com.xworkz.television.Repo.TelevisionRepo;
import com.xworkz.television.Repo.TelevisionRepoIMPL;

public class TelevisionServiceIMPL implements TelevisionService {
   TelevisionRepo repo = new TelevisionRepoIMPL();
	@Override
	public boolean save(TelevisionDTO dto) {
		if(dto.getBrand()!=null && dto.getPrice()>=15000 && dto.getSize()!=null) {
			repo.save(dto);
		}
		return false;
	}
	@Override
	public ArrayList<TelevisionDTO> read() {
		return repo.read();
	}
	@Override
	public TelevisionDTO findByNameAndSize(String brand, String size) {
		return repo.findByNameAndSize(brand, size);
		
	}
	@Override
	public TelevisionDTO findTypeAndColourByIndex(String type, String colour, int index) {
		
		return repo.findTypeAndColourByIndex(type, colour, index);
		
	}
	@Override
	public TelevisionDTO updateSizeByType(String size, String type) {
		
		return repo.updateSizeByType(size, type);
	}
	@Override
	public boolean deleteByBrandAndColour(String brand, String colour) {
		if( colour!=null&&brand!=null) {
			repo.deleteByBrandAndColour(colour,brand);
			return true;
		}
				return false;
	
	}

}
