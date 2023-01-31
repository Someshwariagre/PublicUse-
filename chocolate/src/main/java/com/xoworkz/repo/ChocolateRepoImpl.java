package main.java.com.xoworkz.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xoworkz.dto.ChocolateDto;



public class ChocolateRepoImpl implements ChocolateRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();
	

	@Override
	public boolean createAll(ChocolateDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return true;
	}

	@Override
	public List<ChocolateDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", ChocolateDto.class);
		List resultList = query.getResultList();
		em.getTransaction().commit();
		return resultList;
	}

	@Override
	public ChocolateDto findByColourAndWieght(String colour, String wieght) {
		if (em != null) {

			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByColourAndWieght", ChocolateDto.class);
			query.setParameter("cl", colour);
			query.setParameter("wt", wieght);
			em.getTransaction().commit();
			return (ChocolateDto) query.getSingleResult();

		}
		return null;
	}

	@Override
	public ChocolateDto findByPriceAndName(int price, String name) {
		if (em != null) {

			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByPriceAndName", ChocolateDto.class);
			query.setParameter("pr", price);
			query.setParameter("nm", name);
			em.getTransaction().commit();
			return (ChocolateDto) query.getSingleResult();

		}
	
		return null;
	}

	@Override
	public boolean updateWieghtByNameAndColour(String weight, String name, String colour) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateWieghtByNameAndColour");
			query.setParameter("wt", weight);
			query.setParameter("nm", name);
			query.setParameter("cl", colour);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}

		return false;
	}

	@Override
	public boolean updateNameByIdAndWieght(String name, int id, String weight) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateNameByIdAndWieght");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.setParameter("wt", weight);
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
