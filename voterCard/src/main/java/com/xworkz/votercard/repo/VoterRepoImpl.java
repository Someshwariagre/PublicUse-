package com.xworkz.votercard.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.votercard.dto.VoterDto;



public class VoterRepoImpl implements VoterRepo{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();
	

	
	@Override
	public String save(VoterDto dto) {
		if(em!=null) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return "data is saved Succeusfully";
		
	}

	return "data is not valid";

}



	@Override
	public List<VoterDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", VoterDto.class);
		List resultList = query.getResultList();
		em.getTransaction().commit();
		return resultList;
		
	}

}
