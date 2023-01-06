package com.xworkz.institues.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.institues.dto.InstituesDTO;


public class InstituesRepoIMPL implements InstitutesRepository {
  List<InstituesDTO> database = new ArrayList<InstituesDTO>();
	@Override
	public boolean save(InstituesDTO dto) {
		database.add(dto);
		System.out.println("data is added to database");
		return true;
	}

	@Override
	public List<InstituesDTO> read() {
		return database;
		
		
	}

	@Override
	public InstituesDTO findByNameandCourse(String name, String Course) {
		for (InstituesDTO instituesDTO : database) {
			if(instituesDTO.getName().equals(name)&& instituesDTO.getCourse().equals(Course)) {
				System.out.println("data is found");
				System.out.println(instituesDTO);
				return instituesDTO;
			}
		}
		return null;
	}
	@Override
	public InstituesDTO findBylocationandrating(String location, int rating) {
		for(InstituesDTO dto:database) {
			if(dto.getLocation().equals(location)) {
				if(rating>=0 && rating<=10) {
					System.out.println("data is found");
					System.out.println(dto);
				}
			}
		}
			return null;
		}
	@Override
	public boolean updateLocationByIndex(String location, int index) {
		InstituesDTO dto2=database.get(index);
		dto2.setLocation(location);
		database.set(index, dto2);
		return true;
		
		
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		for(int i = 0;i <database.size();i++) {
			InstituesDTO dto=database.get(i);
			if( dto.getName().equals(name)) {
				dto.setCourse(course);
				dto.setName(name);
				database.set(i, dto);
				System.out.println("Updated course by name");
			
			}
		}

		return true;
	}
	

	@Override
	public boolean deleteByrating(int rating) {
		Iterator<InstituesDTO> itr = database.iterator();
		while (itr.hasNext()) {
			InstituesDTO dto=itr.next();
			if(dto.getRating()==rating) {
			itr.remove();
				System.out.println("deleting data by Rating");
				return true;
			}
				
			}
		
		
		return false;
	}
	
	


}
