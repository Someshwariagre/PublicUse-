package main.java.com.xoworkz.service;

import java.util.List;

import main.java.com.xoworkz.dto.ChocolateDto;
import main.java.com.xoworkz.repo.ChocolateRepo;
import main.java.com.xoworkz.repo.ChocolateRepoImpl;

public class ChocolateServiceImpl implements ChocolateService {
	ChocolateRepo repo = new ChocolateRepoImpl();

	@Override
	public boolean createAll(ChocolateDto dto) {
		if (dto != null) {
			
					System.out.println("data is valid");
					repo.createAll(dto);
					return true;

				
			
		}
		return false;
	}

	@Override
	public List<ChocolateDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public ChocolateDto findByColourAndWieght(String colour, String wieght) {
		if(colour.length()>2 && wieght.length()>1) {
			System.out.println("data is alid");
			return repo.findByColourAndWieght(colour, wieght);
			
		}
		return null;
	}

	@Override
	public ChocolateDto findByPriceAndName(int price, String name) {
		if(price>5 && name!= null) {
			System.out.println("data is valid");
			return repo.findByPriceAndName(price, name);
		}
		return null;
	}

	@Override
	public boolean updateWieghtByNameAndColour(String weight, String name, String colour) {
		if(weight.length()>1 && name!=null && colour!=null) {
			System.out.println("data is valid");
			return repo.updateWieghtByNameAndColour(weight, name, colour);
			
		}
		return false;
	}

	@Override
	public boolean updateNameByIdAndWieght(String name, int id, String weight) {
	  if(name!= null && weight.length()>1) {
		  System.out.println("data is valid");
		  return repo.updateNameByIdAndWieght(name, id, weight);
	  }
		return false;
	}

	@Override
	public boolean deleteByColourAndName(String colour, String name) {
		if(colour!=null && name!= null ) {
			System.out.println("data is valid");
			return repo.deleteByColourAndName(colour, name);
		}
		return false;
	}

}
