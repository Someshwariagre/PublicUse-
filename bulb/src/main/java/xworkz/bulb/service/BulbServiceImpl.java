package main.java.xworkz.bulb.service;

import java.util.List;

import main.java.xworkz.bulb.dto.BulbDto;
import main.java.xworkz.bulb.repo.BulbRepo;
import main.java.xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbService {
	
	BulbRepo repo = new BulbRepoImpl();

	@Override
	public boolean save(BulbDto dto) {
		if(dto!=null) {
			System.out.println("data is valid");
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public List<BulbDto> readAll() {
		return repo.readAll();
	}

	@Override
	public BulbDto findByName(String name) {
		if(name!=null) {
			System.out.println("Data is valid");
			return repo.findByName(name);
		}
		
		return null;
	}


}
