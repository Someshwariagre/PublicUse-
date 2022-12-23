package com.xworkz.highwayrepo;

import java.util.ArrayList;

import com.xworkz.highway.HighwayDto;

public class HighwayRepoImpl implements HighwayRepo {

	ArrayList<HighwayDto> highway =new ArrayList<HighwayDto>();
	
	@Override
	public boolean save(HighwayDto dto) {
		highway.add(dto);
		return false;
	}

	@Override
	public ArrayList<HighwayDto> read() {
		
		return highway;
	}

	@Override
	public ArrayList<HighwayDto> findByName() {
		
		return highway;
	}
	

}
