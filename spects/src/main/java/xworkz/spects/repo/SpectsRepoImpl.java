package main.java.xworkz.spects.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.xworkz.spects.dto.SpectsDto;

public class SpectsRepoImpl implements SpectsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(SpectsDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;

	}

	@Override
	public List<SpectsDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", SpectsDto.class);
		List resultList = query.getResultList();
		em.getTransaction().commit();
		return resultList;

	}

	@Override
	public SpectsDto findByShapeAndprice(String shape, int price) {
		if (em != null) {

			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByShapeAndPrice", SpectsDto.class);
			query.setParameter("sh", shape);
			query.setParameter("pr", price);
			em.getTransaction().commit();
			return (SpectsDto) query.getSingleResult();

		}
		return null;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updatePriceByName");
			query.setParameter("pri", price);
			query.setParameter("nm", name);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

	@Override
	public boolean updateColorByPriceAndShape(String colour, int price, String shape) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateColorByPriceAndShape");
			query.setParameter("cl", colour);
			query.setParameter("pric", price);
			query.setParameter("shp", shape);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

	@Override
	public boolean deleteByPriceAndColor(int price, String colour) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPriceAndColor");
			query.setParameter("pc", price);
			query.setParameter("cr", colour);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

	@Override
	public boolean DeleteByNameAndId(String name, int id) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("DeleteByNameAndId");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

}
