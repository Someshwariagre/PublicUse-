package com.xworkz.road.service;

import org.springframework.ui.Model;

import com.xworkz.road.dto.Roaddto;

public interface RoadService {
 boolean save(Roaddto dto , Model model);

}
