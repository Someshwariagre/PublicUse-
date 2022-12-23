package com.xworkz.highservice;

import java.util.ArrayList;

import com.xworkz.highway.HighwayDto;
import com.xworkz.highwayrepo.HighwayRepo;
import com.xworkz.highwayrepo.HighwayRepoImpl;

public class HighwayServiceImpl implements HighwayService {
HighwayRepo repo=new HighwayRepoImpl();

	@Override
	public boolean save(HighwayDto dto) {
		repo.save(dto);
		return false;
	}

	@Override
	public ArrayList<HighwayDto> read() {
		
		return repo.read();
	}

	@Override
	public HighwayDto findByName(String name) {
		ArrayList<HighwayDto> highwayname = repo.read();
		for (HighwayDto highwayDto : highwayname) {
			if(highwayDto.getName().equals(name)){
				System.out.println(highwayDto);
			}
		}
		
		return null;
	}
	

}
