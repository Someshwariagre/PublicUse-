package institute.com.xworkz.service;

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
		if(name!=null && name.length()>=4) {
			
		if(dto.getName().equalsIgnoreCase(name) && dto.getCourse().equalsIgnoreCase(Course)) {
			
	       
                return repo.findByNameandCourse(name, Course);

				}
				
				}
			
			}
	
		return null;
	}
	
	
	@Override
	public InstituteDTO findBylocationandrating(String location, int rating) {
	if(location!=null && location.length()>=8) {
		if(rating>=2 && rating<=8) {
			return repo.findBylocationandrating(location, rating);
		}
	}
		return null;
	}

	@Override
	public boolean updateLocationByIndex(String location, int index) {
      if(location!= null && location.length()>=7) {
    	  repo.updateLocationByIndex(location, index);
      }
		return true;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		if(course !=null && course.length()>=15) {
			if(name !=null && name.length()>=7) {
				repo.updateCourseByName(course, name);
				return true;
			}
		
		}
		return false;
	

	}

	@Override
	public boolean deleteByrating(int rating) {
	
		repo.deleteByrating(rating);
		
	
	return true;

	}


}
