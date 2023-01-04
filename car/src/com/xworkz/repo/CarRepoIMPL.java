package com.xworkz.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.dto.CarDTO;

public class CarRepoIMPL implements CarRepo{
	List<CarDTO> carlist=new ArrayList<CarDTO>();
	@Override
	public boolean save(CarDTO dto) {
		System.out.println("saving in database");
		carlist.add(dto);
		return true;
	}
	@Override
	public List<CarDTO> read() {
		
		return carlist;
	}
	@Override
	public List<CarDTO> findByName(String name) {
		for(CarDTO list:carlist) { 
			if(list.getBrand().equals(name)){
				System.out.println(list);
			
			}
	}
		return carlist;
	
	}
	@Override
	public CarDTO updateColorByIndex(String colour, int index) {
		CarDTO update=carlist.get(index);
			update.setColour(colour);
			carlist.set(index, update);
			
			return null;
			
		}
	@Override
	public CarDTO updateSpeedByBrand(int speed, String brand) {
		for (int i = 0; i < carlist.size(); i++) {
			CarDTO	c =carlist.get(i);
		if(c.getBrand().equals(brand)) {
			c.setSpeed(speed);
			carlist.set(i, c);
			
		}
			
		}
		return null;
	}
	@Override
	public CarDTO updatePricedByType(int price, String type) {
		for (int i = 0; i < carlist.size(); i++) {
			CarDTO amount=carlist.get(i);
			if(amount.getType().equals(type)) {
				amount.setPrice(price);
				carlist.set(i, amount);
			}
			
		}
		return null;
	}
	@Override
	public CarDTO deleteByIndex(int index) {
		carlist.remove(index);
		return null;
	}
	@Override
	public CarDTO deleteBrandByColour(String colour,String brand) {
		Iterator<CarDTO> itr=carlist.iterator();
		while(itr.hasNext()) {
			CarDTO delete=itr.next();
			if(delete.getColour().equals(colour) && delete.getBrand().equals(brand));
			carlist.remove(delete);
		System.out.println("deleted successfully");
		return delete;
		}
		return null;
			
	}

}
