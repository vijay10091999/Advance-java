package com.spring.orm.without.xml;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class Config {
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springorm");
		ds.setUsername("root");
		ds.setPassword("Lufa@7917");
		return ds;
	}
	
	   private final Properties hibernateProperties() {
	        Properties hibernateProperties = new Properties();
	        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
	        hibernateProperties.setProperty("hibernate.show_sql", "true");
	        hibernateProperties.setProperty( "hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	        hibernateProperties.setProperty( "hibernate.enable_lazy_load_no_trans","true");
	        return hibernateProperties;
	    }
	   
	   @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(getDataSource());
	        sessionFactory.setPackagesToScan("com.spring.orm.without.xml");
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	    }
	
	   @Bean("hibernateTemplate")
		public HibernateTemplate gethibernate() {
			HibernateTemplate hibernateTemplate = new HibernateTemplate();
			LocalSessionFactoryBean s = sessionFactory();
			hibernateTemplate.setSessionFactory(s.getObject());
			return hibernateTemplate;
		}
	   
	   @Bean("studentdaoimp")
	    public StudentDaoImp getStudentDao() {
	    	StudentDaoImp s = new StudentDaoImp();
	    	s.setHibernateTemplate(gethibernate());
	    	return s;
	    }
	   
	   @Bean("student")
	    public Student getStudent() {
	    	return new Student();
	    }
	   
	   @Bean
	    public PlatformTransactionManager hibernateTransactionManager() {
	        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	        transactionManager.setSessionFactory(sessionFactory().getObject());
	        return transactionManager;
	    }
}
