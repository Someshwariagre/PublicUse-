package com.xworkz.bag.repo;

import com.xworkz.bag.dto.BagDto;

public interface BagRepo {
public boolean save(BagDto dto);
	
	public BagDto read();
	
	public BagDto findByname(String name);
	
	public BagDto findByBrandnameAndId(String brandname,int id);

}
