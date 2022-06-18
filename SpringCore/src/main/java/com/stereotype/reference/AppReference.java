package com.stereotype.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppReference {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// component create class name as object name
				ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/reference/config.xml");
				Teacher t = context.getBean("teacher",Teacher.class);
				System.out.println("Teacher Id : " + t.getTid());
				System.out.println("Teacher Name : " + t.getTname());
				System.out.println("Type of list : " + t.getSubject().getClass().getName());
				System.out.println("List of teacher subject : " + t.getSubject());
				System.out.println("Private class : " + t.getStudent().getSid() + " = " + t.getStudent().getSname());
			}

	}


