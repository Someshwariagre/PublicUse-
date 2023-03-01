package main.java.com.xworkz.bangal.service;

import java.util.List;

import main.java.com.xworkz.bangal.dto.BangleDto;
import main.java.com.xworkz.bangal.repo.BangleRepo;
import main.java.com.xworkz.bangal.repo.BangleRepoImpl;

public class BangleServiceImpl implements BangleService {
BangleRepo repo = new BangleRepoImpl();
	@Override
	public boolean save(BangleDto dto) {
		if(dto!=null) {
			System.out.println("data is valid");
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public List<BangleDto> readAll() {
		
		return repo.readAll();
	}

}
