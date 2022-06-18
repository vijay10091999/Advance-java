package com.springjdbc.without.xml;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class config {
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Lufa@7917");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("studentdao")
	public StudentDao getstudentdao() {
		StudentDaoImplement studentdao = new StudentDaoImplement();
		studentdao.setJdbcTemplate(getTemplate());
		return studentdao;
	}
	
	@Bean("stu")
	public Student getstudent() {
		return new Student();
	}
}
