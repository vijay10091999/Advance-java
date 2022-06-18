package com.without.xml.project1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.without.xml.project1.Config;

@Configuration
public class Config {

	@Bean(name="Emp")
	public Employee createEmployee() {
		Employee s1 = new Employee();
		s1 = new Services().Employeedetails(s1);
		return s1;
	}
	@Bean(name = "Dep")
	public Department tellDepartment() {
		Department a = new Department();
		Department s = new Services().Departmentdetails(a);
		return s;
	}
	
	@Bean(name = "Com")
	public Company ComapanyName() {
		Company a = new Company();
		Company s = new Services().Companydetails(a);
		return s;
	}
	
	
	
}
