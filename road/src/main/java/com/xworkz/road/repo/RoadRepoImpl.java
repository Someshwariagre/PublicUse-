package com.xworkz.road.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.xworkz.road.dto.Roaddto;

@Repository
public class RoadRepoImpl implements RoadRepo {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();

	public RoadRepoImpl() {
		System.out.println("Running in repo");
	}

	@Override
	public boolean save(Roaddto dto, Model model) {

		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		model.addAttribute("successPage", "Data saved Successfully");
		em.close();
		return true;
	}

}
