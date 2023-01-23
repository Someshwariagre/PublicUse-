package com.xworkz.pencil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.pencil.configure.PencilConfiguration;
import com.xworkz.pencil.dto.PencilDto;

public class PencilRunner {
	public static void main(String[] args) {
		PencilDto dto1 =  new PencilDto(1,"Apsara",5, "hb", "0.5");
		
		Session session = PencilConfiguration.getSessionfactory().openSession();
		
		Transaction tansaction = session.beginTransaction();
		
		session.save(dto1);
		
		
		
	}

}
