package com.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // by interface
	    ApplicationContext context1 =new ClassPathXmlApplicationContext("com/bean/lifecycle/config.xml");
	    Doctor d = (Doctor)context1.getBean("d1");
	    System.out.println(d);
	    ((AbstractApplicationContext)context1).registerShutdownHook();
	}

}
