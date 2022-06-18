package com.injection.collection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/Injection/collection/constructor/config.xml");
		Employee e = (Employee) context.getBean("emp1");
        System.out.println(e);
	}

}
