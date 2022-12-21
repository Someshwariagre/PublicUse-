package com.xworkz.JDBC.theatre;

import java.util.ArrayList;

public class TheatreServiceIMPL implements TheatreService {

	TheatreRepository theatreRepository = new TheatreRepositoryIMPL();

	@Override
	public TheatreDTO save(TheatreDTO theatreDto) {
		if(theatreDto!=null) {
			theatreRepository.save(theatreDto);
			System.out.println("Check for data");
			}
		return theatreDto;
	}
	@Override
	public TheatreDTO read(TheatreDTO theatreDto) {
		ArrayList<TheatreDTO> theatres = theatreRepository.read(theatreDto);
		for(TheatreDTO theatre :theatres) {		
		//System.out.println(theatre);
	}
		return theatreDto;

    }
	
	@Override
	public TheatreDTO findBy(TheatreDTO theatreName) {
		ArrayList<TheatreDTO> TheatreList =  theatreRepository.findBy();
		for(TheatreDTO t : TheatreList) {
			System.out.println(t.getLocation());
		}
		return theatreName;
	}
		
	
	
	    
}

