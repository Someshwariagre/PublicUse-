package com.xworkz.students.service;
import com.xworkz.students.entity.StudentDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.xworkz.students.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo repo;
	@Override
	public boolean save(StudentDto dto, Model model) {
		if(dto!=null) {
			System.out.println("Data is valid");
			return this.repo.save(dto, model);
		}
		return false;
	}
//	@Override
//	public List<StudentDto> readAll() {
//		
//		return repo.readAll();
//	}
//
//	@Override
//	public StudentDto findByColourAndWieght(String colour, String wieght) {
//		if(colour.length()>2 && wieght.length()>1) {
//			System.out.println("data is alid");
//			return repo.findByColourAndWieght(colour, wieght);
//			
//		}
//		return null;
//	}
//
//	@Override
//	public StudentDto findByPriceAndName(int price, String name) {
//		if(price>5 && name!= null) {
//			System.out.println("data is valid");
//			return repo.findByPriceAndName(price, name);
//		}
//		return null;
//	}
//
//	@Override
//	public boolean updateWieghtByNameAndColour(String weight, String name, String colour) {
//		if(weight.length()>1 && name!=null && colour!=null) {
//			System.out.println("data is valid");
//			return repo.updateWieghtByNameAndColour(weight, name, colour);
//			
//		}
//		return false;
//	}
//
//	@Override
//	public boolean updateNameByIdAndWieght(String name, int id, String weight) {
//	  if(name!= null && weight.length()>1) {
//		  System.out.println("data is valid");
//		  return repo.updateNameByIdAndWieght(name, id, weight);
//	  }
//		return false;
//	}
//
//	@Override
//	public boolean deleteByColourAndName(String colour, String name) {
//		if(colour!=null && name!= null ) {
//			System.out.println("data is valid");
//			return repo.deleteByColourAndName(colour, name);
//		}
//		return false;
//	}


}
