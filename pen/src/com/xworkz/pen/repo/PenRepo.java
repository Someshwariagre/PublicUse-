package com.xworkz.pen.repo;

import java.util.List;

import com.xworkz.pen.dto.PenDto;

public interface PenRepo {
	
	public boolean save(PenDto dto);
	public List<PenDto> read();
	public PenDto findById(int id);

}
