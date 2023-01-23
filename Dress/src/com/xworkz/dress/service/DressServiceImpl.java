package com.xworkz.dress.service;

import java.util.List;

import com.xworkz.dress.dto.DressDto;
import com.xworkz.dress.repo.DressRepo;
import com.xworkz.dress.repo.DressRepoImpl;

public class DressServiceImpl implements DressService {
	DressRepo repo = new DressRepoImpl();

	@Override
	public boolean save(List<DressDto> dto) {
		if (dto != null) {
			for (DressDto dressDto : dto) {
				if (dressDto.getId() > 0 && dressDto.getName().length() >= 2) {
					System.out.println("data is valid");
					repo.save(dressDto);

				}
			}
			return true;
		}
		return false;
	}

}
