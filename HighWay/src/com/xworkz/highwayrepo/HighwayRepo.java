package com.xworkz.highwayrepo;

import java.util.ArrayList;

import com.xworkz.highway.HighwayDto;

public interface HighwayRepo {
	
	public boolean save(HighwayDto dto);
	
	public ArrayList<HighwayDto> read();
	
public ArrayList<HighwayDto> findByName();
}
