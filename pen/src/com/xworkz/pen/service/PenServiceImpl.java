package com.xworkz.pen.service;

import java.util.List;

import com.xworkz.pen.dto.PenDto;
import com.xworkz.pen.repo.PenRepo;
import com.xworkz.pen.repo.PenRepoImpl;

public class PenServiceImpl implements PenService {
	
	PenRepo repo = new PenRepoImpl();

	@Override
	public boolean save(PenDto dto) {
		if(dto!=null) {
			System.out.println("Dto is valid");
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public List<PenDto> read() {
	
		return repo.read();
	}

}
