package com.xworkz.somu_project.repo;


import java.time.LocalTime;
import java.util.List;


import com.xworkz.somu_project.entity.ProjectEntity;

public interface ProjectRepo {
	 boolean save(ProjectEntity entity) ;
	 
	 default ProjectEntity findByName(String name){
			return null;
		}
	 
	 public List<ProjectEntity> findAll();

		default Long findByEmail(String email) {
			return null;
		}

		default Long findByMobile(Long mobile) {
			return null;
		}

		default ProjectEntity resetPassword(String email) {
			return null;
		}

		boolean update(ProjectEntity userEntity);

		boolean updatePassword(String userId, String password, Boolean resetPassword, LocalTime passwordChangedTime);

		boolean logincount(String userId, int count);

	 
	 
	

}
