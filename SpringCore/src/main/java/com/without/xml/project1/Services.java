package com.without.xml.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.without.xml.project.Address;
import com.without.xml.project.Subject;


public class Services {
	Scanner sc = new Scanner(System.in);
	
	public Employee Employeedetails(Employee s) {
		System.out.println("Enter Employee Details : ");
		System.out.println("Enter Employee Id");
		int eid = sc.nextInt();
		System.out.println("Enter Employee Name");
		sc.nextLine();
		String ename = sc.nextLine();
		s.setEid(eid);
		s.setEname(ename);
		return s;
	}
	
	public Department Departmentdetails(Department a) {
		System.out.println("Enter Department details : ");
		System.out.println("Enter Department id : ");
		int Did = sc.nextInt();
		System.out.println("Enter Department name : ");
		sc.nextLine();
		String Dname = sc.nextLine();
		a.setDid(Did);
		a.setDname(Dname);
		return a;
	}
	
	public Company Companydetails(Company a) {
		System.out.println("Enter Company details : ");
		System.out.println("Enter Company id : ");
		int cid = sc.nextInt();
		System.out.println("Enter Company name : ");
		sc.nextLine();
		String cname = sc.nextLine();
		Company c = new Company(cid,cname);
		return c;
	}
	
	}
	

