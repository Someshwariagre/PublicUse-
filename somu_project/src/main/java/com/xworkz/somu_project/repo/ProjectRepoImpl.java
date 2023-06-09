package com.xworkz.somu_project.repo;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.somu_project.entity.ProjectEntity;
@Repository
public class ProjectRepoImpl implements ProjectRepo{
	public ProjectRepoImpl() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(ProjectEntity entity) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		return true;

}

	@Override
	public ProjectEntity findByName(String name) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("findByName");
		query.setParameter("nm", name);
		
		ProjectEntity lentity = (ProjectEntity) query.getSingleResult();
		
		System.out.println(lentity);
		return lentity;
	}
	
	
	@Override
	public List<ProjectEntity> findAll() {
		EntityManager em = emf.createEntityManager();
		  em.getTransaction().begin();
			Query query = em.createNamedQuery("find");
			List<ProjectEntity> list = query.getResultList();
			em.getTransaction().commit();
			em.close();
			return list;
	
		}
	
	
	@Override
	public Long findByEmail(String email) {
		EntityManager em = emf.createEntityManager();
	     em.getTransaction().begin();
			Query query = em.createNamedQuery("emailId");
			query.setParameter("em", email);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			em.getTransaction().begin();
			em.close();
			return value;

		
			
		

	}

	

	@Override
	public Long findByMobile(Long mobile) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
			Query query = em.createNamedQuery("mobileId");
			query.setParameter("mb", mobile);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			em.getTransaction().commit();
			em.close();
			return value;

		
			
		
	}

	@Override
	public boolean logincount(String name, int count) {
		
		EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateLoginCount");
			query.setParameter("userID", name);
			query.setParameter("count", count);
			query.executeUpdate();
			em.getTransaction().commit();
			em.close();
			return true;
	}

	@Override
	public ProjectEntity resetPassword(String email) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
			Query query = em.createNamedQuery("emailid");
			query.setParameter("EI", email);
			Object object = query.getSingleResult();
			ProjectEntity entity = (ProjectEntity) object;
			em.getTransaction().commit();
			em.close();
			return entity;
		
			
		}
	

	@Override
	public boolean update(ProjectEntity pEntity) {
		EntityManager em = emf.createEntityManager();
		 em.getTransaction().begin();
			em.merge(pEntity);
			em.getTransaction().commit();
			em.close();
			return true;
		
			
		
	}

	@Override
	public boolean updatePassword(String name, String password, Boolean resetPassword,
			LocalTime passwordChangedTime) {
		EntityManager em = emf.createEntityManager();
		 em.getTransaction().begin();
			
			Query query = em.createNamedQuery("updatePassword");
			query.setParameter("uu", name);
			query.setParameter("up", password);
			query.setParameter("urp", resetPassword);
			query.setParameter("pct", passwordChangedTime);
			query.executeUpdate();
			em.getTransaction().commit();
			em.close();
			return true;
	
	}
	}


