package com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Standalone Collection
		1. It use make global proprieties for every beans.
		2. We can change Default type of collection in specific beans
		*/

				
				ApplicationContext context =new ClassPathXmlApplicationContext("com/standalone/collection/config.xml");
				Employee e = (Employee) context.getBean("emp1");
		        System.out.println(e);
		        System.out.println("Name : " + e.getName());
		        System.out.println("List of phone no : " + "type :" + e.getPhones().getClass().getName() + " "+ e.getPhones());
		        System.out.println("Set of address no : "+ "type :" + e.getAddresses().getClass().getName() + " " + e.getAddresses());
		        System.out.println("Map of all department : "+ "type :" + e.getDepartment().getClass().getName() + " " + e.getDepartment());
			}
	}
