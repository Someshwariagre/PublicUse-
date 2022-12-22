package com.xworkz.repository;

import java.util.ArrayList;
import com.xworkz.theatre.TheatreDTO;

public class TheatreRepositoryIMPL implements TheatreRepository {

	ArrayList<TheatreDTO> theatre = new ArrayList<TheatreDTO>();

	@Override
	public ArrayList<TheatreDTO> save(TheatreDTO theatreDto) {
		theatre.add(theatreDto);
		System.out.println("save the method in Service");
		return theatre;
	}

	@Override
	public ArrayList<TheatreDTO> read() {
		return theatre;
	}

	@Override
	public ArrayList<TheatreDTO> findBy(String theatreName) {
		return theatre;
	}


}
