package com.xoworkz.film.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DBConfig {
	
	public DBConfig() {
		System.out.println("created from" + this.getClass().getSimpleName());
	}
    @Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		System.out.println("Local  Entity manager");
		 LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
		 emfb.setPersistenceUnitName("film");
		return emfb;
	}
}

