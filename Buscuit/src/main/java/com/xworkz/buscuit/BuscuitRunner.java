package main.java.com.xworkz.buscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.com.xworkz.buscuit.dto.BuscuitDto;

public class BuscuitRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		BuscuitDto dto = new BuscuitDto(1, "Goodday", 10, "Cookies", "Gluco");
		BuscuitDto dto1 = new BuscuitDto(2, "Sunfeast", 12, "cream", "SunFlower");
		BuscuitDto dto2 = new BuscuitDto(3, "Marigold", 20, "Cookies", "Wheat");
		BuscuitDto dto3 = new BuscuitDto(4, "Oreo", 25, "Cream", "chocolate");
		BuscuitDto dto4 = new BuscuitDto(5, "Parle-G", 30, "Cookies", "Gluco");
		BuscuitDto dto5 = new BuscuitDto(6, "Hide and seak", 40, "Cookies", "chocolate");
		BuscuitDto dto6 = new BuscuitDto(7, "50-50", 15, "Cookies", "salt");
		BuscuitDto dto7 = new BuscuitDto(8, "Britania", 16, "Cookies", "Gluco");
		BuscuitDto dto8 = new BuscuitDto(9, "Dark-Fantasy", 17, "cream", "cholocate");
		BuscuitDto dto9 = new BuscuitDto(10, "Bourbon", 18, "cream", "Sugar");
		
//		entityManager.persist(dto9);
//		entityManager.persist(dto8);
//		entityManager.persist(dto7);
//		entityManager.persist(dto6);
//		entityManager.persist(dto5);
//		entityManager.persist(dto4);
//		entityManager.persist(dto3);
//		entityManager.persist(dto2);
//		entityManager.persist(dto1);
//		entityManager.persist(dto);
		
		
		
		
		BuscuitDto del =entityManager.find(BuscuitDto.class, 6);
//		System.out.println(del);
		
//		dto5.setName("happy-Happy");
//		entityManager.merge(dto5);
	   
		entityManager.remove(del);
	
		
	
		
		entityManager.getTransaction().commit();
	}

}
