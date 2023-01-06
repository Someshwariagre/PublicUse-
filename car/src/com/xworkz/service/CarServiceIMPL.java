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
			
			repo.save(dto);
			
		}
		return true;
	}

	@Override
	public List<CarDTO> read() {
		
		return repo.read();
	}

	@Override
	public List<CarDTO> findByName(String name) {
			
		return repo.findByName(name);
		
		
	}

	@Override
	public CarDTO updateColorByIndex(String color, int index) {
		
			return repo.updateColorByIndex(color,index);
		
	}

	@Override
	public CarDTO updateSpeedByBrand(int speed, String brand) {
	
			return repo.updateSpeedByBrand(speed,brand);
		
		
		}
	

	@Override
	public CarDTO updatePricedByType(int price, String type) {
		return repo.updatePricedByType(price,type);
	}
	

	@Override
	public CarDTO deleteByIndex(int index) {
	return repo.deleteByIndex(index);
		
	}

	@Override
	public CarDTO deleteBrandByColour( String colour,String brand) {
		if( colour!=null) {
			CarDTO delete1=repo.deleteBrandByColour(colour,brand);
			System.out.println("deleted data");
		}
				return null;
	}

	@Override
	public CarDTO deleteBySpeed(int speed) {
		
		  repo.deleteBySpeed(speed);
		return null;
		
	}
	
	
	
	}


