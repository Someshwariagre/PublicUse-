package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.theatre.TheatreDTO;
public interface TheatreService {
	 TheatreDTO save(TheatreDTO theatreDto);
     ArrayList<TheatreDTO> read();
     TheatreDTO findBy(String theatreName);
     //TheatreDTO updateByIndex(int index);
}
