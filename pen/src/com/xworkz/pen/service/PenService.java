package com.xworkz.pen.service;

import java.util.List;

import com.xworkz.pen.dto.PenDto;

public interface PenService {
	
	public boolean save(PenDto dto);
	public List<PenDto> read();

}
