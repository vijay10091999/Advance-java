package com.without.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		@Configuration -> Indicate that file is configuration file .
		@ComponentScan -> if you are using @Bean then it is not neccssary to used . it used for define base package inside java config file.
		@Bean -> It used to remove @component and done all configuration inside java configuration
		*/

			ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
			Student s = context.getBean("student",Student.class);
			System.out.println(s);
			Student s1 = context.getBean("student2",Student.class);
			System.out.println(s1);
	}

}
