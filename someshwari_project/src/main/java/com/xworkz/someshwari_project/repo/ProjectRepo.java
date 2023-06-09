package com.xworkz.someshwari_project.repo;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import com.sun.el.stream.Optional;

import com.xworkz.someshwari_project.entity.ProjectEntity;
import com.xworkz.someshwari_project.entity.TechnologyEntity;

public interface ProjectRepo {
	boolean save(ProjectEntity userEntity);

	default List<ProjectEntity> findAll() {
		return Collections.emptyList();
	}

	default ProjectEntity getByUser(String userId) {
		return null;
	}

	default Long findByUser(String user) {
		return null;
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long number) {
		return null;
	}

	default ProjectEntity resetPassword(String email) {
		return null;
	}

	boolean update(ProjectEntity userEntity);

	boolean updatePassword(String userId, String password, Boolean resetPassword, LocalTime passwordChangedTime);

	boolean logincount(String userId, int count);

	boolean saveTechnology(TechnologyEntity technology);

	default List<TechnologyEntity> viewTechnology(String users) {
		return null;

	}

	default List<TechnologyEntity> searchTechnology(String teName, String teLangauge, String teVersion, String teOwner,
			String teSupportFrom, String teSupportTo, String teLicense, String teOpenSource, String teOsType, int id) {
		return null;

	}
}
