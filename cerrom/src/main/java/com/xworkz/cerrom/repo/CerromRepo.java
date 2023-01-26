package main.java.com.xworkz.cerrom.repo;

import java.util.List;


import main.java.com.xworkz.cerrom.dto.CerromDto;

public interface CerromRepo {
	
	public boolean save(CerromDto dto);
	public CerromDto findById(int id);
	public boolean updateNameById( String name,int id);
	public boolean DeleteById(int id);
}
