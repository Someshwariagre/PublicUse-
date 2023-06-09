package com.xworkz.OneToOne;

import javax.persistence.*;

public class OmeToOneMap {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();

		Person person = em.find(Person.class, 1);
		Address address = person.getAddress();

		System.out.println(person);
		System.out.println(address);

		em.close();
		emf.close();
	}
}
