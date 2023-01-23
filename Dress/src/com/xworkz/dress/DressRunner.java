package com.xworkz.dress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.xworkz.dress.dto.DressDto;
import com.xworkz.dress.repo.DressRepo;
import com.xworkz.dress.repo.DressRepoImpl;
import com.xworkz.dress.service.DressService;
import com.xworkz.dress.service.DressServiceImpl;

public class DressRunner {
	public static void main(String[] args) {
	
	DressService service = new DressServiceImpl();
	 
	
	DressDto dto1 = new DressDto(1, "Puma", "T-Shirt");
	DressDto dto2 = new DressDto(2, "Nike", "Kurta");
	DressDto dto3 = new DressDto(3, "Banjara", "Saree");
	DressDto dto4 = new DressDto(4, "Banaras", "Silk Saree");
	
	List<DressDto> list = Arrays.asList(dto1,dto2,dto3,dto4);

	
	service.save(list);
	
	}
}
