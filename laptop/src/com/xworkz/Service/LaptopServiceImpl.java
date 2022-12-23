package com.xworkz.Service;

import java.util.ArrayList;

import com.xworkz.Repository.LaptopRepository;
import com.xworkz.Repository.LaptopRepositoryImpl;
import com.xworkz.laptop.LaptopDTO;



public class LaptopServiceImpl implements LaptopService {
LaptopRepository repo = new LaptopRepositoryImpl();

@Override
public LaptopDTO save(LaptopDTO laptopdto) {
	if (laptopdto != null) {
		repo.save(laptopdto);
		System.out.println("Check for data");
	}
	return laptopdto;
}
@Override
public ArrayList<LaptopDTO> read() {
	return repo.read();
}

@Override
public LaptopDTO findBy(String name) {
	ArrayList<LaptopDTO> lapy = repo.read();
	 for(LaptopDTO lap:lapy) {
		 if(lap.getName().equals(name)) {
			 System.out.println(lap);
			 return lap;
		 }
	 }
	 return null;
}
@Override
public LaptopDTO deleteByIndex(int index) {		
	   if(index>=0) {
		System.out.println("laptop detail is deleted");
		repo.deleteByIndex(index);

	}
		
	return null;
	
	}
@Override
public LaptopDTO updateNameByIndex(int index, String name) {
	
	if(index>=0) {
    System.out.println("details updated Successfully");
	repo.updateNameByIndex(index, name);
}
	return null;

}
}

