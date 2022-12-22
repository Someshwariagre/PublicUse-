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

	public TheatreDTO findBy(String TheatreName) {
		 ArrayList<TheatreDTO> list=theatreRepository.read();
		 for(TheatreDTO th:list) {
			 if(th.getTheatreName().equals(TheatreName)) {
					System.out.println(th);
					
				 }
			 
			 }
		return null;	
}


//	@Override
//	public TheatreDTO updateByIndex(int index) {
//		TheatreDTO list=theatreRepository.updateByIndex(index);
//		if(list.getTheatreName().length()>=0) {
//			System.out.println("Condition matched");
//		if(list.getTheatreName().equals(list));
//		return null;
//	}
//		return list;

	}
