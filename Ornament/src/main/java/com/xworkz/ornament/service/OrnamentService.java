package main.java.com.xworkz.ornament.service;

import java.util.List;

import org.springframework.stereotype.Component;

import main.java.com.xworkz.ornament.dto.OrnamentDto;

public interface OrnamentService {
	public boolean save(OrnamentDto dto);
	public List<OrnamentDto> readAll();
	public boolean updateTypeByName(String type,String name);
	public boolean deleteByColourAndName(String colour,String name);
}
