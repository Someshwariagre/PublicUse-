package com.xworkz.doctorsinfo.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.doctorsinfo.entity.DoctorsEntity;

public interface DoctorsRepo {
	boolean save(DoctorsEntity doctorsEntity);

	boolean update(DoctorsEntity doctorsEntity);

	default DoctorsEntity findById(int id) {
		return null;
	}

	default List<DoctorsEntity> findByName(String name) {
		return Collections.emptyList();
	}

	boolean  deletById(int id);
	default List<DoctorsEntity> findAll() {
		return Collections.emptyList();
	}

}
