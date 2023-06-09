package com.xworkz.parlour.config;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.parlour")

public class ParlourConfiguration {

	public ParlourConfiguration() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewresolver() {
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean lcemf() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz.parlour.entity");
		bean.setDataSource(ds());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;

	}

	public DataSource ds() {
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dms.setUrl("jdbc:mysql://localhost:3306/sep_08");
		dms.setPassword("Xworkzodc@123");
		dms.setUsername("root");

		return dms;

	}

}
