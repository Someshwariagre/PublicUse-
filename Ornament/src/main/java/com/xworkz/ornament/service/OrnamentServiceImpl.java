package main.java.com.xworkz.ornament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.java.com.xworkz.ornament.dto.OrnamentDto;
import main.java.com.xworkz.ornament.repo.OrnamentRepo;
import main.java.com.xworkz.ornament.repo.OrnamentRepoImpl;

@Component
public class OrnamentServiceImpl implements OrnamentService {

	@Autowired
	private OrnamentRepo repo;

	@Override

	public boolean save(OrnamentDto dto) {
		if (dto != null) {
			System.out.println("data is valid");
			repo.save(dto);
			return true;
		}
		return false;

	}

	@Override
	public List<OrnamentDto> readAll() {

		return repo.readAll();
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		if (type != null && name != null) {
			System.out.println("Data is valid");
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByColourAndName(String colour, String name) {
		if (colour != null && name != null) {
			System.out.println("data is valid");
		}
		return false;
	}

}
