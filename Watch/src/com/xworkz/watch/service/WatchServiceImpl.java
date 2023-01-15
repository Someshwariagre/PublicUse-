package com.xworkz.watch.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepo;
import com.xworkz.watch.repo.WatchRepoImpl;

public class WatchServiceImpl implements WatchService {
	WatchRepo repo = new WatchRepoImpl();

	@Override
	public WatchDto save(WatchDto dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			
			if (dto.getBrandName().length() >= 2 && dto.getColour().length() >= 2) {
				System.out.println("dto name and colour is matched");
				
				if (dto.getId() > 0) {
					System.out.println("Id is valid");
					
					if (dto.getPrice() >= 500) {
						System.out.println("price is valid");
						
						if (dto.getType().length() >= 2) {
							System.out.println("Type is valid");
							repo.save(dto);

						}

						else {
							System.out.println("dto name is not valid");
						}
					} else {
						System.out.println("Dto id valid");
					}

				} else {
					System.out.println("price is not valid");
				}

			} else {
				System.out.println("type is not valid");
			}

		} else {
			System.out.println("dto is null");

		}
		return dto;

	}

	@Override
	public List<WatchDto> read() {

		return repo.read();
	}

	@Override
	public List<WatchDto> findByBrandnameAndColour(String brandname, String colour) {
		if (brandname.length() >= 3 && colour.length() >= 3) {
			System.out.println("name and colour is matched");
		} else {
			System.out.println("is not valid");
		}
		return repo.findByBrandnameAndColour(brandname, colour);
	}

	@Override
	public WatchDto findByIdandType(int id, String type) {
		if (id != 0) {
			System.out.println("id is valid");

			if (type.length() >= 3) {
				System.out.println("type is valid");
				return repo.findByIdandType(id, type);

			}
		} else {
			System.out.println("id is not valid");

		}

		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {
		if (name.length() >= 3 && id != 0) {
			System.out.println("data is valid");
			repo.updateNameById(name, id);
			return true;
		} else {
			System.out.println("name is not valid");

		}
		return false;

	}

	@Override
	public boolean deleteByColourAndType(String colour, String type) {
		if (colour.length() >= 3 && type.length() >= 3) {
			System.out.println("data is valid");
			
			if(colour.equals(colour)&&type.equals(type)) {
				System.out.println("Data is Valid");
			
			repo.deleteByColourAndType(colour, type);
			return true;

		
		}
		else { 
			System.out.println("colour not matched");
		}
		}
	
		else {
			System.out.println("data is not valid");
		}
		return false;
	}
}
