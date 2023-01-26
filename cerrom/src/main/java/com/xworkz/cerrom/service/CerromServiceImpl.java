package main.java.com.xworkz.cerrom.service;

import main.java.com.xworkz.cerrom.dto.CerromDto;
import main.java.com.xworkz.cerrom.repo.CerromRepo;
import main.java.com.xworkz.cerrom.repo.CerromRepoImpl;

public class CerromServiceImpl implements CerromService {
CerromRepo repo = new CerromRepoImpl();
	@Override
	public boolean save(CerromDto dto) {
		if(dto!=null) {
			System.out.println("Data is valid");
			repo.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public CerromDto findById(int id) {
	if(id>0) {
		System.out.println("Data is valid");
		return repo.findById(id);
	}
		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {
		if(id>0) {
			System.out.println("data is valid");
			return repo.updateNameById(name, id);
		}
		return false;
	}

	@Override
	public boolean DeleteById(int id) {
	if(id>0) {
		System.out.println("Data is valid");
		return repo.DeleteById(id);
	}
		return false;
	}

}
