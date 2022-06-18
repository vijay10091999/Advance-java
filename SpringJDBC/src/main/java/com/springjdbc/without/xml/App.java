package com.springjdbc.without.xml;

import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		while (true) {

			ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
			StudentDao studentdao = context.getBean("studentdao", StudentDao.class);
			Student s = context.getBean("stu", Student.class);
			Scanner sc = new Scanner(System.in);
			System.out.println("=================================================");
			System.out.println(
					"1.Insert Query \n2.Update Query \n3.Delete Query \n4.Get One Student Data \n5.Get All Student Data  \n6.Exit");
			System.out.println("=================================================");
			int choice = sc.nextInt();

			// insert data
			if (choice == 1) {
				insertandupdate(s);
				int res1 = studentdao.insert(s);
				if (res1 != 0) {
					System.out.println("=================================================");
					System.out.println("Insert successfully");
				}
			}
//        //update data 
			if (choice == 2) {
				insertandupdate(s);
				int res2 = studentdao.change(s);
				if (res2 != 0) {
					System.out.println("=================================================");
					System.out.println("update successfully");
				}
			}
//        // delete data
			if (choice == 3) {

				deleteandgetonestudent(s);
				int res3 = studentdao.delete(s.getId());
				if (res3 != 0) {
					System.out.println("=================================================");
					System.out.println("delete successfully");
				}
			}
//         //get one student data
			if (choice == 4) {
				deleteandgetonestudent(s);
				Student student = studentdao.getstudent(s.getId());
				System.out.println("=================================================");

				System.out.println("Name : " + student.getName());
				System.out.println("City : " + student.getCity());
			}
//        // all student obejct
			if (choice == 5) {
				List<Student> students = studentdao.getallstudent();
				System.out.println("=================================================");
				for (Student s1 : students) {
					System.out.println(s1);
				}

			}
			if (choice == 6) {
				System.exit(0); // exit
			}
		}

	}

	private static void deleteandgetonestudent(Student s) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		s.setId(id);
		sc.nextLine();

	}

	private static void insertandupdate(Student s) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome to spring jdbc ");
		System.out.println("Enter student details : ");
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		s.setId(id);
		sc.nextLine();
		System.out.println("Enter student name");
		String name = sc.nextLine();
		s.setName(name);
		System.out.println("Enter student city");
		String city = sc.next();
		s.setCity(city);
	}
}
