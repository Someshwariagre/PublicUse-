package main.java.com.xworkz.cerrom.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.com.xworkz.cerrom.dto.CerromDto;

public class CerromRepoImpl implements CerromRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public boolean save(CerromDto dto) {
		if (dto != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public CerromDto findById(int id) {
		entityManager.getTransaction().begin();
		CerromDto find = entityManager.find(CerromDto.class, 3);
		entityManager.getTransaction().commit();

		return find;
	}

	@Override
	public boolean updateNameById(String name, int id) {
		entityManager.getTransaction().begin();
		CerromDto find = entityManager.find(CerromDto.class, 3);
		find.setName(name);
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public boolean DeleteById(int id) {
		entityManager.getTransaction().begin();
		CerromDto dto = entityManager.find(CerromDto.class, 3);
		entityManager.remove(dto);
		entityManager.getTransaction().commit();
		return true;
	}

}
