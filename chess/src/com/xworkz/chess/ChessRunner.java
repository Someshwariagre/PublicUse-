package com.xworkz.chess;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.xworkz.chess.config.ChessConfig;
import com.xworkz.chess.dto.ChessDto;

public class ChessRunner {
	
	public static void main(String[] args) {
		ChessDto dto1 =  new ChessDto(1,2,64,50);
		ChessDto dto2 =  new ChessDto(2,1,48,40);
		
		
		Session session = ChessConfig.getSessionfactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(dto1);
		session.save(dto2);
		
	     System.out.println(session.get(ChessDto.class, 1));	
	  
		
		Criteria criteria = session.createCriteria(ChessDto.class);
	    List<ChessDto> list =criteria.list();
	    System.out.println(list);
	  
		transaction.commit();
	    session.close();
		
	}

}
	


