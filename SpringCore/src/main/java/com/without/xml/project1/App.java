package com.without.xml.project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		    Employee stu = context.getBean("Emp",Employee.class);
		    
			System.out.println("Welcome to Employee portfolio....");
			System.out.println("Employee ID : " + stu.getEid());
			System.out.println("Employee Name : " + stu.getEname());
			
			Department Dep = context.getBean("Dep",Department.class);
			System.out.println("Department ID : " + Dep.Did);
			System.out.println("Department Name : " + Dep.Dname);
			
			Company Com = context.getBean("Com",Company.class);
			System.out.println("Company ID : " + Com.cid);
			System.out.println("Company Name : " + Com.cname);

			
	}

}
