package com.xworkz.highservice;

import java.util.ArrayList;

import com.xworkz.highway.HighwayDto;

public interface HighwayService {
	
	public boolean save(HighwayDto dto);
	public ArrayList<HighwayDto> read();
	 
	public HighwayDto findByName(String name);
	

}
