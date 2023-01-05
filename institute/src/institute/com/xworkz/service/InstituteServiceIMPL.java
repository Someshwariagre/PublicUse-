package institute.com.xworkz.service;

import java.util.ArrayList;
import java.util.List;

import institute.com.xworkz.dto.InstituteDTO;
import institute.com.xworkz.repo.InstituteRepo;
import institute.com.xworkz.repo.InstituteRepoIMPL;

public class InstituteServiceIMPL  implements InstitueService{
	InstituteRepo repo=new InstituteRepoIMPL();

	@Override
	public boolean save(InstituteDTO dto) {
		System.out.println("data is saved");
		repo.save(dto);
		return true;
	}

	@Override
	public List<InstituteDTO> read() {
		return repo.read();
	}

	@Override
	public InstituteDTO findByNameandCourse(String name, String Course) {
		List<InstituteDTO> read=repo.read();
		for(InstituteDTO dto:read) {
		if(name!=null ) {
		if(dto.getCourse().equals(Course)) {
                return repo.findByNameandCourse(name, Course);
               

				}
				
				}
			
			}
	
		return null;
	}
	
	
	@Override
	public InstituteDTO findBylocationandrating(String location, int rating) {
	
		if(rating>=0) {
			return repo.findBylocationandrating(location, rating);
		}
	
		return null;
	}

	@Override
	public InstituteDTO updateLocationByIndex(String location, int index) {
      if(location!= null ) {
    	  repo.updateLocationByIndex(location, index);
      }
		return null;
	}

	@Override
	public InstituteDTO updateCourseByName(String course, String name) {
			if(name !=null ) {
				repo.updateCourseByName(course, name);
			}
			return null;
	}

	@Override
	public InstituteDTO deleteByrating(int rating) {
		boolean delete=repo.deleteByrating(rating);
		return null;

	

	}


}
