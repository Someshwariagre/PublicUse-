package main.java.com.xworkz.cake.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.com.xworkz.cake.dto.CakeDto;

public class CakeRepoImpl implements CakeRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public boolean save(CakeDto dto) {
		if (dto != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public CakeDto findById(int id) {
		entityManager.getTransaction().begin();
		CakeDto find = entityManager.find(CakeDto.class, id);
		entityManager.getTransaction().commit();
		return find;

	}

//	@Override
	public List<CakeDto> readAll() {
	
//		entityManager.getTransaction().begin();
//		entityManager.load
//		entityManager.getTransaction().commit();
//		
		return null;
	}

	@Override
	public boolean updateNameById( String name ,int id) {
		entityManager.getTransaction().begin();
		CakeDto find = entityManager.find(CakeDto.class, id);
		find.setName(name);
		entityManager.merge(find);
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public boolean DeleteById(int id) {
		entityManager.getTransaction().begin();
		CakeDto find = entityManager.find(CakeDto.class, id);
		entityManager.remove(find);
		entityManager.getTransaction().commit();
		return true;
	}

}
