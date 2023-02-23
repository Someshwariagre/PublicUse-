package com.xworkz.hospital1.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.hospital1.dto.HospitalDto;



public class Hospital1RepoImpl implements Hospital1Repo{
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();
	

	
	@Override
	public String save(HospitalDto dto) {
		if(em!=null) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return "data is saved Succeusfully";
		
	}

	return "data is not valid";

}



	@Override
	public List<HospitalDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", HospitalDto.class);
		List resultList = query.getResultList();
		em.getTransaction().commit();
		return resultList;
		
	}
	}

