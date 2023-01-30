package main.java.xworkz.spects.service;

import java.util.List;

import main.java.xworkz.spects.dto.SpectsDto;
import main.java.xworkz.spects.repo.SpectsRepo;
import main.java.xworkz.spects.repo.SpectsRepoImpl;

public class SpectsServiceImpl implements SpectsService {
	
	SpectsRepo repo = new SpectsRepoImpl();

	@Override
	public boolean save(SpectsDto dto) {
	if(dto!=null) {
		System.out.println("Data is valid");
		 return repo.save(dto);
	}
		return false;
	}
	
	@Override
	public List<SpectsDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public SpectsDto findByShapeAndprice(String shape, int price) {
		if(shape!=null&& price>500) {
			System.out.println("Data is valid");
			return repo.findByShapeAndprice(shape, price);
		}
		return null;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {
		if(price>500 && name!=null) {
			System.out.println("data is valid");
			return repo.updatePriceByName(price, name);
		}
		return false;
	}

	@Override
	public boolean updateColorByPriceAndShape(String colour, int price, String shape) {
	       if(colour!=null && price>500 && shape!=null) {
	    	   System.out.println("data is valid");
	    	   return repo.updateColorByPriceAndShape(colour, price, shape);
	       }
		return false;
	}

	@Override
	public boolean deleteByPriceAndColor(int price, String colour) {
		if(price>500 && colour!=null) {
			System.out.println("data is valid");
			return repo.deleteByPriceAndColor(price, colour);
		}
		return false;
	}

	@Override
	public boolean DeleteByNameAndId(String name, int id) {
		if(name!=null && id>0) {
			System.out.println("data is valid");
			return repo.DeleteByNameAndId(name, id);
		}
		return false;
	}

	

}
