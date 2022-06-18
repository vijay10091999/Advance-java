package com.spring.orm.without.xml;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	while (true) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StudentDao sdao = context.getBean("studentdaoimp",StudentDao.class);
        Student s = context.getBean("student",Student.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
		System.out.println(
				"1.Insert Query \n2.Update Query \n3.Delete Query \n4.Get One Student Data \n5.Get All Student Data  \n6.Exit");
		System.out.println("=================================================");
		int choice = sc.nextInt();

		// insert data
					if (choice == 1) {
						insertandupdate(s);
						int res1 = sdao.insert(s);
						if (res1 != 0) {
							System.out.println("=================================================");
							System.out.println("Insert successfully");
						}
					}
//		        //update data 
					if (choice == 2) {
						insertandupdate(s);
						sdao.update(s);
					//	if (res2 != 0) {
							System.out.println("=================================================");
							System.out.println("update successfully");
						//}
					}
//		        // delete data
					if (choice == 3) {
						deleteandgetonestudent(s);
						sdao.delete(s.getSid());
						//if (res3 != 0) {
							System.out.println("=================================================");
							System.out.println("delete successfully");
						//}
					}
//		         //get one student data
					if (choice == 4) {
						deleteandgetonestudent(s);
						Student student = sdao.getstudent(s.getSid());
						System.out.println("=================================================");

						System.out.println("Name : " + student.getSname());
						System.out.println("City : " + student.getScity());
					}
//		        // all student obejct
					if (choice == 5) {
						List<Student> students = sdao.getallstudent();
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
		s.setSid(id);
		sc.nextLine();

	}

	private static void insertandupdate(Student s) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome to spring jdbc ");
		System.out.println("Enter student details : ");
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		s.setSid(id);
		sc.nextLine();
		System.out.println("Enter student name");
		String name = sc.nextLine();
		s.setSname(name);
		System.out.println("Enter student city");
		String city = sc.next();
		s.setScity(city);
	}
}

