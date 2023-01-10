package com.xworkz.tree;

import com.xworkz.tree.dto.TreeDto;
import com.xworkz.tree.repo.TreeRepo;
import com.xworkz.tree.repo.TreeRepoImpl;

public class TreeRunner {
	public static void main(String[] args) {
		
	
	TreeRepo repo = new TreeRepoImpl();
	
	TreeDto dto = new TreeDto(1,"Banayan","Green","Creeper",100,"Light green");
	
	repo.save(dto);
	
	repo.read();
	}
	
	
}
