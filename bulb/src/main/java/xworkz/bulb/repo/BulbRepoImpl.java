package main.java.xworkz.bulb.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import main.java.xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	private EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(BulbDto dto) {
		if (dto != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<BulbDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", BulbDto.class);
		List resultList = query.getResultList();
		em.getTransaction().commit();
		return resultList;

	}


	@Override
	public BulbDto findByName(String name) {
		if (em != null) {

			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByName", BulbDto.class);
			query.setParameter("rf", name);
			return (BulbDto) query.getSingleResult();
			
			

		}
		return null;
	}
}
