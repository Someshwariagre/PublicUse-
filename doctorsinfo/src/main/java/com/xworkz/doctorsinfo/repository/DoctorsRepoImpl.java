package com.xworkz.doctorsinfo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.doctorsinfo.entity.DoctorsEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class DoctorsRepoImpl implements DoctorsRepo{
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public DoctorsRepoImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(DoctorsEntity doctorsEntity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			System.out.println("Repo  "+doctorsEntity);
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(doctorsEntity);
			transaction.commit();
			return true;
		} finally {
			em.close();
		}

	}

	@Override
	public DoctorsEntity findById(int id) {
		System.out.println("running in findById in repositery");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			DoctorsEntity fromDB = em.find(DoctorsEntity.class, id);
			return fromDB;
		} finally {
			em.close();
		}

	}

	@Override

	public List<DoctorsEntity> findByName(String name) {

		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findByName");
			query.setParameter("nby", name);
			List<DoctorsEntity> list = query.getResultList();
			System.out.println("Total list size found in repo" + list.size());
			return list;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean update(DoctorsEntity doctorsEntity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.merge(doctorsEntity);
			et.commit();
			return true;
		} finally {
			em.close();
		}

	}

	@Override
	public boolean deletById(int id) {
		System.out.println("running in deletById in repositery");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			DoctorsEntity entity = em.find(DoctorsEntity.class, id);
			em.remove(entity);
			System.out.println("entirepositeryty in " + entity);
			et.commit();
			return true;
		} finally {
			em.close();
		}
	}

	@Override
	public List<DoctorsEntity> findAll() {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("find");
			List<DoctorsEntity> list = query.getResultList();
			System.out.println("Total list size found in repo" + list.size());
			return list;
		} finally {
			em.close();
		}
	}

}
