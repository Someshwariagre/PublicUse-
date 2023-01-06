package com.xworkz.television.Repo;

import java.util.ArrayList;
import java.util.Iterator;


import com.xworkz.television.DTO.TelevisionDTO;

public class TelevisionRepoIMPL implements TelevisionRepo {
    ArrayList<TelevisionDTO> db = new ArrayList<TelevisionDTO>();
	@Override
	public boolean save(TelevisionDTO dto) {
	System.out.println("data is saved");
	db.add(dto);
		return true;
	}
	@Override
	public ArrayList<TelevisionDTO> read() {
		
		return db;
	}
	@Override
	public TelevisionDTO findByNameAndSize(String brand, String size) {
	for (TelevisionDTO televisionDTO : db) {
		if(televisionDTO.getBrand().equals(brand)&&televisionDTO.getSize().equals(size)) {
			System.out.println("Found the data");
			System.out.println(televisionDTO);
		}
	}
		return null;
	}
	@Override
	public TelevisionDTO findTypeAndColourByIndex(String type, String colour, int index) {
		db.get(index).equals(db);
	for (TelevisionDTO televisionDTO : db) {
		if(televisionDTO.getType().equals(type)&&televisionDTO.getColour().equals(colour)) {
			System.out.println("found the Data");
			System.out.println(televisionDTO);
			
		}
		
	}
		return null;
	}
	@Override
	public TelevisionDTO updateSizeByType(String size, String type) {
		for (int i = 0; i < db.size(); i++) {
			TelevisionDTO update  =db.get(i);
		if(update.getType().equals(type)) {
			update.setSize(size);
			db.set(i, update);
			System.out.println("Updated Data");
			
		}
			
		}
		return null;
	}
	@Override
	public boolean deleteByBrandAndColour(String brand, String colour) {
		 Iterator<TelevisionDTO> itr =db.iterator();
			while(itr.hasNext()) {
				TelevisionDTO delete =itr.next();
				 if(delete.getColour().equals(colour) && delete.getBrand().equals(brand)) {
					 itr.remove();
					 System.out.println("deleted data");
					return true;
				 }
			}
			return false;
		

		
	}
	

}
