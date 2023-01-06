package com.xworkz.television.Repo;

import java.util.ArrayList;

import com.xworkz.television.DTO.TelevisionDTO;

public interface TelevisionRepo {
	
	public boolean save(TelevisionDTO dto);
	public ArrayList<TelevisionDTO> read();
	public TelevisionDTO findByNameAndSize(String brand, String size);
	public TelevisionDTO findTypeAndColourByIndex(String type, String colour,int index);
	public TelevisionDTO updateSizeByType(String size, String type);
	public boolean deleteByBrandAndColour(String brand, String colour);
	

}
