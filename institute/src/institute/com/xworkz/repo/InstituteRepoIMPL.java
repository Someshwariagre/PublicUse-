package institute.com.xworkz.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import institute.com.xworkz.dto.InstituteDTO;

public class InstituteRepoIMPL implements InstituteRepo {
	ArrayList<InstituteDTO> list= new ArrayList<InstituteDTO>();

	@Override
	public boolean save(InstituteDTO dto) {
     System.out.println("data saving to database");
     list.add(dto);
     
		return false;
	}

	@Override
	public List<InstituteDTO> read() {
	
		return list;
	}

	@Override
	public InstituteDTO findByNameandCourse(String name, String Course) {
		for(InstituteDTO dto:list) {
			if(dto.getName().equalsIgnoreCase(name) && dto.getCourse().equalsIgnoreCase(Course)) {
				return dto;
			}
		}
		
		
		return null;
	}
	
	@Override
	public InstituteDTO findBylocationandrating(String location, int rating) {
	for(InstituteDTO dto:list) {
		if(dto.getLocation().equals(location)) {
			if(rating>=3 && rating<=10) {
				System.out.println(dto);
			}
		}
	}
		return null;
	}


	@Override
	public boolean updateLocationByIndex(String location, int index) {
		InstituteDTO dto=list.get(index);
		dto.getLocation();
			dto.setLocation(location);
			list.set(index, dto);
		
		return true ;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		for(int i = 0;i <list.size();i++) {
			InstituteDTO dto=list.get(i);
			if(dto.getCourse().equals(course) && dto.getName().equals(name)) {
				dto.setCourse(course);
				dto.setName(name);
				list.set(i, dto);
			
			}
		}

		return true;
	}

	@Override
	public boolean deleteByrating(int rating) {
		Iterator<InstituteDTO> Dto=list.iterator();
		while (Dto.hasNext()) {
			InstituteDTO dto=Dto.next();
				list.remove(rating);
				
				return true;
			}
		
		
		return false;
	}

}
