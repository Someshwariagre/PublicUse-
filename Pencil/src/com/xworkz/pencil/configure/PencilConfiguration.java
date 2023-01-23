package com.xworkz.pencil.configure;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.pencil.dto.PencilDto;

public class PencilConfiguration {
	
	public static SessionFactory sessionFactroy;
	 
	public static SessionFactory getSessionfactory() {
		if(sessionFactroy==null) {
			
			Configuration config = new Configuration();
			
			Properties properties = new Properties();
			
			
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/sep_08");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DIALECT, "org.hibernet.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.HBM2DDL_AUTO, "drop-table");
			
			
			config.setProperties(properties);
			
			config.addAnnotatedClass(PencilDto.class);
			
			ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
			sessionFactroy = config.buildSessionFactory(service);
			return sessionFactroy;
			
			
		}
		return sessionFactroy;
	}
	

}
