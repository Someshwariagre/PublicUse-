package main.java.com.xworkz.bangal.service;

import java.util.List;

import main.java.com.xworkz.bangal.dto.BangleDto;

public interface BangleService {
	public boolean save(BangleDto dto);
	public List<BangleDto> readAll();

}
