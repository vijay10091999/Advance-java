package com.autowire.xml.bynameandbytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// autowire= "byName" will search in config.xml like college bean is there or not
		// autowire= "byType" will search and check type in config.xml like college bean found then it's type is College or not
	    // disadv of byTYpe - if we have two beans of same type then it will throw error
			ApplicationContext context =new ClassPathXmlApplicationContext("com/autowire/xml/bynameandbytype/config.xml");
	        Student s1 = (Student)context.getBean("student1");
	        System.out.println(s1);
	        Student s2 = (Student)context.getBean("student2");
	        System.out.println(s2);
	}

}
