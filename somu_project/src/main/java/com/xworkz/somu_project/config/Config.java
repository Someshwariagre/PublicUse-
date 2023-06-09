package com.xworkz.somu_project.config;

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
@ComponentScan("com.xworkz.somu_project")
public class Config {
	
	
	public Config() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Bean
	public ViewResolver viewresolver() {
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean lcemf() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz.somu_project.entity");
		bean.setDataSource(ds());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;

	}

	public DataSource ds() {
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dms.setUrl("jdbc:mysql://localhost:3306/project");
		dms.setPassword("Xworkzodc@123");
		dms.setUsername("root");

		return dms;

	}

}
