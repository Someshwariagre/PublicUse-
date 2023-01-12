package com.xworkz.shirt.repo;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;

public interface ShirtRepo {
	public boolean save(ShirtDto dto);
	public List<ShirtDto> read();
	public ShirtDto findNameAndId(String name, int id);
	public boolean updateSizeByName(String size , String name);
	public boolean deleteByColour(String colour);
	public boolean deleteBySizeAndName(String size,String name);
	

}
