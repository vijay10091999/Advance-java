package com.autowire.xml.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// autowire="constructor" it search bean college in config.xml and inject value in constructor way
		
			ApplicationContext context =new ClassPathXmlApplicationContext("com/autowire/xml/byconstructor/config.xml");
	        Student s1 = (Student)context.getBean("student1");
	        System.out.println(s1);
	        Student s2 = (Student)context.getBean("student2");
	        System.out.println(s2);
	}

}
