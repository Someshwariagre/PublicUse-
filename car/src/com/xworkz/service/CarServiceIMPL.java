package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.CarDTO;
import com.xworkz.repo.CarRepo;
import com.xworkz.repo.CarRepoIMPL;

public class CarServiceIMPL implements CarService{
	CarRepo repo=new CarRepoIMPL();

	@Override
	public boolean save(CarDTO dto) {
		if(dto!=null && dto.getBrand().length()>=3) {
			System.out.println("The data is in service");
			repo.save(dto);
			
		}
		return true;
	}

	@Override
	public List<CarDTO> read() {
		System.out.println("The data is in service");
		return repo.read();
	}

	@Override
	public List<CarDTO> findByName(String name) {
			
		return repo.findByName(name);
		
		
	}

	@Override
	public CarDTO updateColorByIndex(String color, int index) {
		if(color!=null && color.length()>=3 && index>=0) {
			repo.updateColorByIndex(color,index);
		}
		return null;
	}

	@Override
	public CarDTO updateSpeedByBrand(int speed, String brand) {
		if(speed>=100 && brand!=null ) {
			repo.updateSpeedByBrand(speed,brand);
		}
		return null;
		}
	

	@Override
	public CarDTO updatePricedByType(int price, String type) {
		if(price>=600000 && type!=null && type.length()>=3 ) {
		
		return repo.updatePricedByType(price,type);
	}
		return null;
	}

	@Override
	public CarDTO deleteByIndex(int index) {
	System.out.println("data must be sent to repository for deletion");
	repo.deleteByIndex(index);
		return null;
	}

	@Override
	public CarDTO deleteBrandByColour( String colour,String brand) {
	 repo.deleteBrandByColour(colour,brand);
	return null;
	
	}

}
