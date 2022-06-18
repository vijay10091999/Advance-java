package com.injection.reference.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context =new ClassPathXmlApplicationContext("com/Injection/reference/constructor/config.xml");
		   Exam ex1 = (Exam) context.getBean("exam1");
		   System.out.println(ex1);
		   
		   Exam ex2 = (Exam) context.getBean("exam2");
		   System.out.println(ex2);
		   
		   Exam ex3 = (Exam) context.getBean("exam3");
		   System.out.println(ex3);
	}

}
