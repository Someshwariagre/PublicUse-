package com.xworkz.someshwari_project.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.someshwari_project.dto.ProjectDto;
import com.xworkz.someshwari_project.entity.ProjectEntity;
import com.xworkz.someshwari_project.entity.TechnologyEntity;
import com.xworkz.someshwari_project.repo.ProjectRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TechServiceImpl implements TechService {
	@Autowired
	private ProjectRepo userRepositery;

	@Override
	public ProjectDto updateTechnology(String userId, TechnologyEntity technology, Model model) {
		ProjectEntity userEntity = this.userRepositery.getByUser(userId);
		List<TechnologyEntity> list = userEntity.getTechnology();
		technology.setEntity(userEntity);
		technology.setCreatedBy(userId);
		technology.setCreatedDate(LocalDateTime.now());
		boolean save = this.userRepositery.saveTechnology(technology);
	    System.out.println("Technology  " + save);
		return null;
	}

	@Override
	public List<TechnologyEntity> technology(String userId) {
		ProjectEntity entity = this.userRepositery.getByUser(userId);
		List<TechnologyEntity> list = entity.getTechnology();
		return list;
	}

	@Override
	public List<TechnologyEntity> searchTechnology(String userId, String teName, String teLangauge, String teVersion,
			String teOwner, String teSupportFrom, String teSupportTo, String teLicense, String teOpenSource,
			String teOsType) {
		ProjectEntity entity = this.userRepositery.getByUser(userId);
		int id = entity.getId();
		List<TechnologyEntity> list = this.userRepositery.searchTechnology(teName, teLangauge, teVersion, teOwner,
				teSupportFrom, teSupportTo, teLicense, teOpenSource, teOsType, id);
		System.out.println("Search List" + list);
		return list;
}
}
