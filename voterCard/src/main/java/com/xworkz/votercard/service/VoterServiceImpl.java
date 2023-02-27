package com.xworkz.votercard.service;

import java.util.List;


import com.xworkz.votercard.dto.VoterDto;
import com.xworkz.votercard.repo.VoterRepo;
import com.xworkz.votercard.repo.VoterRepoImpl;

public class VoterServiceImpl implements VoterService {
	
	VoterRepo repo = new VoterRepoImpl();

	@Override
	public String save(VoterDto dto) {
		if(dto!=null&& dto.getName().length()>3) {
			System.out.println("data is valid");
			repo.save(dto);
			return "data is valid";
		}
		return null;
	}

	@Override
	public List<VoterDto> readAll() {
		
		return repo.readAll();
	}

	


}
