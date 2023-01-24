package com.xworkz.ac;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.ac.config.ACConfig;
import com.xworkz.ac.dto.ACDto;



public class ACRunner {
	
	public static void main(String[] args) {
		ACDto dto1 =  new ACDto(1,"LG","White",45000);
		ACDto dto2 =  new ACDto(2,"Samsung","Black",40000);
		ACDto dto3 =  new ACDto(3,"Sony","Cream",50000);
		
		
		Session session = ACConfig.getSessionfactory().openSession();
		
		Transaction transaction = session.beginTransaction();
//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);
		
	     System.out.println(session.get(ACDto.class, 3));	
	  
		
		Criteria criteria = session.createCriteria(ACDto.class);
	    List<ACDto> list =criteria.list();
	    System.out.println(list);
	  
		transaction.commit();
	    session.close();
		
	}

}
