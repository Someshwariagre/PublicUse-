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
			if(dto.getName().equals(name) && dto.getCourse().equals(Course)) {
				 System.out.println("finding by name and course");
                  System.out.println(dto);
				return dto;
			}
		}
		
		
		return null;
	}
	
	@Override
	public InstituteDTO findBylocationandrating(String location, int rating) {
	for(InstituteDTO dto:list) {
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
		InstituteDTO dto=list.get(index);
			dto.setLocation(location);
			list.set(index, dto);
		System.out.println("updated location by name");
		return true ;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		for(int i = 0;i <list.size();i++) {
			InstituteDTO dto=list.get(i);
			if( dto.getName().equals(name)) {
				dto.setCourse(course);
				dto.setName(name);
				list.set(i, dto);
				System.out.println("Updated course by name");
			
			}
		}

		return true;
	}

	@Override
	public boolean deleteByrating(int rating) {
		Iterator<InstituteDTO> itr = list.iterator();
		while (itr.hasNext()) {
			InstituteDTO dto=itr.next();
			if(dto.getRating()==rating) {
			itr.remove();
				System.out.println("deleting data by Rating");
				return true;
			}
				
			}
		
		
		return false;
	}

}
