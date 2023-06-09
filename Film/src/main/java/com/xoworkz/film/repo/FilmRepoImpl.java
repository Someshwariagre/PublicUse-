package com.xoworkz.film.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xoworkz.film.dto.FilmDto;
@Repository
public class FilmRepoImpl implements FilmRepo {

	public FilmRepoImpl() {
		System.out.println("created from" + this.getClass().getSimpleName());
	}

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(FilmDto dto, Model model) {
		if (em != null) {
			
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		return false;

	}
}
