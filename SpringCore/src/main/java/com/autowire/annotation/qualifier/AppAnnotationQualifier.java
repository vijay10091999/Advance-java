package com.autowire.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationQualifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Qualifier is basically for which bean you want to used for object injection
		// use @Qualifier

			ApplicationContext context =new ClassPathXmlApplicationContext("com/autowire/annotation/qualifier/config.xml");
	        Student s1 = (Student)context.getBean("student1");
	        System.out.println(s1);
	}

}
