package com.xworkz.students.repo;

import java.util.List;


import org.springframework.ui.Model;



import com.xworkz.students.entity.StudentDto;


public interface StudentRepo {
	
	boolean save(StudentDto dto , Model model);
//	public List<StudentDto> readAll();
//	public StudentDto findByColourAndWieght(String colour,String wieght);
//	public StudentDto  findByPriceAndName(int price, String name);
//	public boolean updateWieghtByNameAndColour(String weight,String name,String colour);
//	public boolean updateNameByIdAndWieght(String name, int id, String weight);
//	public boolean deleteByColourAndName(String colour,String name);

	List<StudentDto> readAll();


}
