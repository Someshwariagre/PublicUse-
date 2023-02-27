package com.xworkz.votercard.repo;

import java.util.List;

import com.xworkz.votercard.dto.VoterDto;



public interface VoterRepo {
	public String save(VoterDto dto);
	
	public List<VoterDto> readAll();

}
