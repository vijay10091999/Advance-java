package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spel/config.xml");
//		DemoVariable d = context.getBean("dv",DemoVariable.class);
//		System.out.println(d);
		
		
		DemoStaticMethodAndVar d1 = context.getBean("ds",DemoStaticMethodAndVar.class);
		System.out.println(d1);
////		
//		DemoInstanceMethodAndVar d2 = context.getBean("di",DemoInstanceMethodAndVar.class);
//		System.out.println(d2);
	}

}
