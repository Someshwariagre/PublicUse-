package main.java.com.xworkz.ornament.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;


import main.java.com.xworkz.ornament.dto.OrnamentDto;

@Component
public class OrnamentRepoImpl implements OrnamentRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(OrnamentDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();

		return true;
	}

	@Override
	public List<OrnamentDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", OrnamentDto.class);
		List resultList = query.getResultList();
		em.getTransaction().commit();
		return resultList;

	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateTypeByName");
			query.setParameter("tp", type);
			query.setParameter("nm", name);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteByColourAndName(String colour, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByColourAndName");
			query.setParameter("cl", colour);
			query.setParameter("nm", name);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

}
