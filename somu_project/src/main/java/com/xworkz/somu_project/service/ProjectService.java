package com.xworkz.somu_project.service;


import java.util.List;

import java.util.Set;

import javax.validation.ConstraintViolation;


import com.xworkz.somu_project.dto.ProjectDto;

public interface ProjectService {
	
	Set<ConstraintViolation<ProjectDto>>  save(ProjectDto dto);
	default ProjectDto login(String name,String password) {
		return null;
	}
	
	public List<ProjectDto> findAll();
	
	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}

	default Long findByUser(String user) {
		return null;
	}

//	default ProjectDto reSetPassword(String email) {
//		return null;
//	}
//
//	default ProjectDto updatePassword(String name, String password, String confirmPassword) {
//		return null;
//	}
//
//	default ProjectDto updateProfile(String userId, String email, Long mobile, String path) {
//		return null;
//	}
//
//	boolean sendMail(String email, String text);


	
//	void incrementFailedLoginAttempts(String name);
//	boolean isAccountLocked(String name);
//	void resetFailedLoginAttempts(String name);
//	
	

//	boolean lockAccount(ProjectDto dto);
//	
//	boolean isAccountLocked(ProjectDto dto);
//	
//	boolean isOtpValid(ProjectDto dto, String otp);	
}
