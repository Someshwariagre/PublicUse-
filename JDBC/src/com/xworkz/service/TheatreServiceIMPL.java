package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.repository.TheatreRepository;
import com.xworkz.repository.TheatreRepositoryIMPL;
import com.xworkz.theatre.TheatreDTO;

public class TheatreServiceIMPL implements TheatreService {
	TheatreRepository theatreRepository = new TheatreRepositoryIMPL();

	public TheatreDTO save(TheatreDTO theatreDto) {
		if (theatreDto != null) {
			theatreRepository.save(theatreDto);
			System.out.println("Check for data");
		}
		return theatreDto;
	}

	public ArrayList<TheatreDTO> read() {
		return theatreRepository.read();

	}

	public String findBy(String theatreName) {
		ArrayList<TheatreDTO> theatres = theatreRepository.read();
		if (theatres != null)
//			for (TheatreDTO theatreDTO : theatres) {
//				if (theatreDTO.getTheatreName().equals(theatres)) {
//					System.out.println(theatreDTO);
//
//				}
				return theatreName;

			
		return null;

	}

}