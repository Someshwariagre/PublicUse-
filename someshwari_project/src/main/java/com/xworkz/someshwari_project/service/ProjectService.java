package com.xworkz.someshwari_project.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.ui.Model;

import com.xworkz.someshwari_project.dto.ProjectDto;



public interface ProjectService {

	Set<ConstraintViolation<ProjectDto>> validateAndSave(ProjectDto userDTO);

	default ProjectDto userSignIn(String userId, String password, Model Model) {
		return null;
	}

	default List<ProjectDto> findAll() {
		return Collections.emptyList();
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}

	default Long findByUser(String user) {
		return null;
	}

	default ProjectDto reSetPassword(String email) {
		return null;
	}

	default ProjectDto updatePassword(String userId, String password, String confirmPassword) {
		return null;
	}

	default ProjectDto updateProfile(String userId, String email, Long mobile, String path) {
		return null;
	}

//	boolean sendMail(String email, String text);
	
}
