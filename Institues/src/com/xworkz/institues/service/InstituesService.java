package com.xworkz.institues.service;

import java.util.List;

import com.xworkz.institues.dto.InstituesDTO;


public interface InstituesService {
	public boolean save(InstituesDTO dto);
	public List<InstituesDTO> read();
	public InstituesDTO findByNameandCourse(String name,String Course);
    public boolean updateLocationByIndex(String location,int index);
    public boolean updateCourseByName(String course,String name);
    public boolean deleteByrating(int rating);
    public InstituesDTO findBylocationandrating(String location,int rating);

}
