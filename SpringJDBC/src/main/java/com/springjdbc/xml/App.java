package com.springjdbc.xml;

import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/xml/config.xml");
        StudentDao studentdao = context.getBean("studentDao",StudentDao.class);
        Student s = new Student();
        System.out.println("Welcome to spring jdbc ");
        System.out.println("Enter student details : ");
        System.out.println("Enter student id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        s.setId(id);
        sc.nextLine();
        System.out.println("Enter student name");
        String name = sc.nextLine();
        s.setName(name);
        System.out.println("Enter student city");
        String city = sc.next();
        s.setCity(city);
        System.out.println(s);
//        
//        // insert data
//        int res = studentdao.insert(s);
//        if(res != 0) {
//        	System.out.println("Insert successfully");
//        }  
        
        //update data 
//      int res = studentdao.change(s);
//      if(res != 0) {
//      	System.out.println("update successfully");
//      }
        
        // delete data
//        int res = studentdao.delete(s.getId());
//        if(res != 0) {
//       	System.out.println("delete successfully");
//        }
        
         //get one student data
//        Student student = studentdao.getstudent(s.getId());
//        System.out.println("Name : " + student.getName());
//        System.out.println("City : " + student.getCity());
        
         //all student obejct
        List<Student> students = studentdao.getallstudent();
        for(Student s1 : students) {
        	System.out.println(s1);
        }
        
    }
}
