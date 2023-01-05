package institute.com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import institute.com.xworkz.dto.InstituteDTO;

public interface InstituteRepo {
	public boolean save(InstituteDTO dto);
	public List<InstituteDTO> read();
	public InstituteDTO findByNameandCourse(String name,String Course);
    public boolean updateLocationByIndex(String location,int index);
    public boolean updateCourseByName(String course,String name);
    public boolean deleteByrating(int rating);
    public InstituteDTO findBylocationandrating(String location,int rating);

}
