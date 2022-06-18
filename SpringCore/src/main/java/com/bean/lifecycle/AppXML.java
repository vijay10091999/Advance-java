package com.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// by xml
		
	    // we can give any name to methods like init() -> in()		
	    ApplicationContext context =new ClassPathXmlApplicationContext("com/bean/lifecycle/config.xml");
	    Course c = (Course)context.getBean("c1");
	    System.out.println(c);
	    ((AbstractApplicationContext)context).registerShutdownHook();
	  
	}

}
