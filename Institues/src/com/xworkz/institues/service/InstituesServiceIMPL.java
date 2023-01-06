package com.xworkz.institues.service;

import java.util.List;

import com.xworkz.institues.dto.InstituesDTO;
import com.xworkz.institues.repository.InstituesRepoIMPL;
import com.xworkz.institues.repository.InstitutesRepository;

public class InstituesServiceIMPL implements InstituesService {
     InstitutesRepository repo = new InstituesRepoIMPL();
	@Override
	public boolean save(InstituesDTO dto) {
		if(dto!=null) {
		  repo.save(dto);
		}
		return true;
	}

	@Override
	public List<InstituesDTO> read() {
		return repo.read();
		
	}

	@Override
	public InstituesDTO findByNameandCourse(String name, String Course) {
		
				return repo.findByNameandCourse(name, Course);	
	}
	
	@Override
	public InstituesDTO findBylocationandrating(String location, int rating) {
		if(rating>=0) {
		return repo.findBylocationandrating(location, rating);
	}
		return null;
	}

	@Override
	public boolean updateLocationByIndex(String location, int index) {
		if(index>=0) {
			return repo.updateLocationByIndex(location, index);
			
		}
		return false;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		if (name!=null) {
			return repo.updateCourseByName(course, name);
		}
		return false;
	}

	@Override
	public boolean deleteByrating(int rating) {
	repo.deleteByrating(rating);
		return true;
	}



}

