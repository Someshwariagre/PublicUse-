package com.xworkz.road.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.xworkz.road.dto.Roaddto;
import com.xworkz.road.repo.RoadRepo;

@Service
public class RoadServiceImpl implements RoadService {

	@Autowired
	private RoadRepo repo;

	public RoadServiceImpl() {
		System.out.println("Running in service");
	}

	public boolean save(Roaddto dto, Model model) {
		if (dto != null) {
			System.out.println("Data is valid");

			return this.repo.save(dto, model);
		}
		return false;

	}

}
