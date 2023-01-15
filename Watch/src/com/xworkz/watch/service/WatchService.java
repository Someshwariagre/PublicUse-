package com.xworkz.watch.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchService {
	public WatchDto save(WatchDto dto);
	public List<WatchDto> read();
	public List <WatchDto> findByBrandnameAndColour(String brandname, String colour);
	public WatchDto findByIdandType(int id,String type);
	public boolean updateNameById(String name , int id);
	public boolean deleteByColourAndType(String colour, String type);
	

}
