package institute.com.xworkz.service;

import java.util.List;

import institute.com.xworkz.dto.InstituteDTO;

public interface InstitueService {
	   public boolean save(InstituteDTO dto);
	   public List<InstituteDTO> read();
	   public InstituteDTO findByNameandCourse(String name,String Course);
	   public InstituteDTO updateLocationByIndex(String location,int index);
	   public InstituteDTO updateCourseByName(String course,String name);
	   public InstituteDTO deleteByrating(int rating);
	   public InstituteDTO findBylocationandrating(String location,int rating);

}
