package com.xworkz.votercard.service;

import java.util.List;

import com.xworkz.votercard.dto.VoterDto;

public interface VoterService {
public String save(VoterDto dto);
	
	public List<VoterDto> readAll();

}
