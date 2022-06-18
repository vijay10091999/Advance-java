package com.injection.primitive.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =new ClassPathXmlApplicationContext("com/injection/primitive/constructor/config.xml");
	    Student student1 = (Student) context.getBean("student1");
	    Student student2 = (Student) context.getBean("student2");
	    Student student3 = (Student) context.getBean("student3");
	    System.out.println(student1);
	    System.out.println(student2);
	    System.out.println(student3);
	}

}
