package main.java.com.xworkz.cake.service;

import java.util.List;

import main.java.com.xworkz.cake.dto.CakeDto;
import main.java.com.xworkz.cake.repo.CakeRepo;
import main.java.com.xworkz.cake.repo.CakeRepoImpl;

public class CakeServiceImpl implements CakeService{
	CakeRepo repo = new CakeRepoImpl();

	@Override
	public boolean save(CakeDto dto) {
	  if(dto!=null) {
		  System.out.println("data is valid");
		  repo.save(dto);
		  return true;
		  
	  }
		return false;
	}

	@Override
	public CakeDto findById(int id){
	if(id>0) {
		System.out.println("Data is valid");
		return repo.findById(id);
	}
		return null;
	}

	@Override
	public List<CakeDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public boolean updateNameById(String name, int id) {
		if(id>0) {
			System.out.println("Data is valid");
			return true;
		}
		return false;
	}

	@Override
	public boolean DeleteById(int id) {
		if(id>0) {
			System.out.println("data is valid");
			return true;
		}
		return false;
	}
	

}
