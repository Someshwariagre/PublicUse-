package com.xworkz.repository;

import java.util.ArrayList;

import com.xworkz.theatre.TheatreDTO;
public interface TheatreRepository {
	   ArrayList<TheatreDTO> save(TheatreDTO theatreDto);
       String findBy(String theatreName);
		ArrayList<TheatreDTO> read();
}
