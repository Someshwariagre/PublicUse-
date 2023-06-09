package com.xworkz.someshwari_project.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.someshwari_project.dto.ProjectDto;
import com.xworkz.someshwari_project.entity.TechnologyEntity;



public interface TechService {
	default ProjectDto updateTechnology(String userId, TechnologyEntity technology, Model model) {
		return null;
	}

	default List<TechnologyEntity> technology(String userId) {
		return null;
	}

	default List<TechnologyEntity> searchTechnology(String userId, String teName, String teLangauge, String teVersion,
			String teOwner, String teSupportFrom, String teSupportTo, String teLicense, String teOpenSource,
			String teOsType) {
		return null;

	}

}
