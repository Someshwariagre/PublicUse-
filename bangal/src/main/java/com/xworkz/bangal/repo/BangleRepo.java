package main.java.com.xworkz.bangal.repo;

import java.util.List;

import main.java.com.xworkz.bangal.dto.BangleDto;



public interface BangleRepo {
	public boolean save(BangleDto dto);
	public List<BangleDto> readAll();

}
