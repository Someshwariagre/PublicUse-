package com.xworkz.parlour.repo;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parlour.dto.ParlourDto;
import com.xworkz.parlour.entity.ParlourEntity;

@Repository
public class ParlourRepoImpl implements ParlourRepo {
	public ParlourRepoImpl() {
		System.out.println("Parlour Repo Impl");
	}

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean onSave(ParlourEntity entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	@Override
	public ParlourEntity findById(int id) {
		EntityManager em = emf.createEntityManager();
		ParlourEntity entity = em.find(ParlourEntity.class, id);
		em.close();
		System.out.println("Entity in repo  " + entity);
		return entity;
	}

	@Override
	public List<ParlourEntity> findByName(String name) {
		System.out.println(name);
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("findByName");
		query.setParameter("fbn", name);
		List<ParlourEntity> lentity = query.getResultList();
		// em.close();
		System.out.println(lentity);
		return lentity;
	}
	
	@Override
	public List<ParlourEntity> findAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("findAll");
		List<ParlourEntity> lentity = query.getResultList();
		// em.close();
		System.out.println(lentity);
		return lentity;
	}
	

	@Override
	public boolean onUpdate(ParlourEntity entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	@Override
	public boolean onDelete(int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		ParlourEntity de=em.find(ParlourEntity.class, id);
		em.remove(de);
		em.getTransaction().commit();
		em.close();
		return true;
	}

}
