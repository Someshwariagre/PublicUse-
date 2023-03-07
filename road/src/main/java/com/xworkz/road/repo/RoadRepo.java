package com.xworkz.road.repo;

import org.springframework.ui.Model;

import com.xworkz.road.dto.Roaddto;

public interface RoadRepo {
	boolean save(Roaddto dto , Model model);

}
