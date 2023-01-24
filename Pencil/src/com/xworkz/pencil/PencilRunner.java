package com.xworkz.pencil;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.bytecode.enhance.spi.interceptor.SessionAssociableInterceptor;

import com.xworkz.pencil.configure.PencilConfiguration;
import com.xworkz.pencil.dto.PencilDto;

public class PencilRunner {
	public static void main(String[] args) {
		PencilDto dto1 =  new PencilDto(1,"Apsara",5, "hb", "0.5");
		PencilDto dto2 =  new PencilDto(2,"Nataraj",3, "hb2", "0.7");
		
		Session session = PencilConfiguration.getSessionfactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(dto1);
		session.save(dto2);
		
//	   PencilDto dto=  session.get(PencilDto.class, 1);	
//	   System.out.println(dto);
		
//		Criteria criteria = session.createCriteria(PencilDto.class);
//	    List<PencilDto> list = new ArrayList<PencilDto>();
//	    System.out.println(list);
		
		transaction.commit();
	    session.close();
		
		

		
		
		
	}

}
