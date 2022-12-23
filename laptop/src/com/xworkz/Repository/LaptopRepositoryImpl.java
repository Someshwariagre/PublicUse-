package com.xworkz.Repository;

import java.util.ArrayList;
import com.xworkz.laptop.LaptopDTO;

public class LaptopRepositoryImpl implements LaptopRepository {
	ArrayList<LaptopDTO> laptop = new ArrayList<LaptopDTO>();
	
	@Override
	public ArrayList<LaptopDTO> save(LaptopDTO laptopDto) {
		laptop.add(laptopDto);
		System.out.println("method is saved in service");
		return laptop;
	}
	
	@Override
	public ArrayList<LaptopDTO> read() {
		
		return laptop;
	}

	@Override
	public ArrayList<LaptopDTO> findBy(String name) {
		
		return laptop;
	}
	
	@Override
	public boolean deleteByIndex(int index) {
		laptop.remove(index);
		return true;
		
	}

	@Override
	public ArrayList<LaptopDTO> updateNameByIndex(int index, String name) {
		laptop.add(index, null);
		return laptop;
		
	}
}
