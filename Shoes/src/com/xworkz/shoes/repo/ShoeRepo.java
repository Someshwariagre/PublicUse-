package com.xworkz.shoes.repo;

import com.xworkz.shoes.dto.ShoeDto;

public interface ShoeRepo {
	public boolean save(ShoeDto dto);
	
	public ShoeDto read();
	
	public ShoeDto findByname(String name);
	
	public ShoeDto findByBrandnameAndId(String brandname,int id);
	

}
