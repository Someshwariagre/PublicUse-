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
		System.out.println("Data is in repository and reading the data");
		return carlist;
	}
	@Override
	public List<CarDTO> findByName(String name) {
		System.out.println("data is in repository");
		for(CarDTO list:carlist) { 
			if(list.getBrand().equals(name)){
				System.out.println("databse is iterating");
				System.out.println("The data is in repo and finding by name in database");
				System.out.println(list);
			
			}
	}
		return carlist;
	
	}
	@Override
	public CarDTO updateColorByIndex(String colour, int index) {
		CarDTO update=carlist.get(index);
			System.out.println("the data has been found and updating");
			update.setColour(colour);
			System.out.println("the color has been updated and adding it in database");
			carlist.set(index, update);
			
			return null;
			
		}
	@Override
	public CarDTO updateSpeedByBrand(int speed, String brand) {
		for (int i = 0; i < carlist.size(); i++) {
			CarDTO	c =carlist.get(i);
		if(c.getBrand().equals(brand)) {
			System.out.println("the brand is matched in database");
			c.setSpeed(speed);
			carlist.set(i, c);
			System.out.println("The speed has been updated by brand name");
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
				System.out.println("The price has been updated");
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
