package com.xworkz.JDBC.theatre;

import java.util.ArrayList;

public class TheatreRepositoryIMPL implements TheatreRepository{
	ArrayList<TheatreDTO> theatre = new ArrayList<TheatreDTO>();

	@Override
	public ArrayList<TheatreDTO> save(TheatreDTO theatreDto) {
		theatre.add(theatreDto);
		System.out.println("save the method in Service");
		return theatre;
	}

	@Override
	public ArrayList<TheatreDTO> read(TheatreDTO theatreDto){
		return theatre;
	}

	@Override
	public ArrayList<TheatreDTO> findBy() {
		return theatre;
	}

	

	
}
