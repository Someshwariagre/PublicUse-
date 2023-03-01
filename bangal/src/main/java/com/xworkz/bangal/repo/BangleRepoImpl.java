package main.java.com.xworkz.bangal.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import main.java.com.xworkz.bangal.dto.BangleDto;

public class BangleRepoImpl implements BangleRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bangal");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(BangleDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		
		return true;
	}

	@Override
	public List<BangleDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", BangleDto.class);
		List resultList = query.getResultList();
		em.getTransaction().commit();
		return resultList;
		
		
	}

}
