package com.with.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Services {
	static Scanner sc = new Scanner(System.in);
	public static int sid;
	public static String sname;
	public static Student storestudent() {
		Student s = new Student();
		System.out.println("Enter Student Details : ");
		System.out.println("Enter Student Id");
		sid = sc.nextInt();
		System.out.println("Enter Student Name");
		sc.nextLine();
		sname = sc.nextLine();
		s.setSid(sid);
		s.setSname(sname);
		return s;
	}
//	
	public static List<Subject> addsubject(){
		ArrayList<Subject> arr = new ArrayList<Subject>();
		System.out.println(arr);
		System.out.println("Enter number of subject  : ");
		int no = sc.nextInt();
		for(int i=0;i<no;i++) { //for(Integer i : no){
			System.out.println("Enter Subject Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Subejct Name : ");
			String subname = sc.nextLine();
			a.stream().filter(j->j<no).count();
			Subject sb = new Subject(id,subname);
			arr.add(sb);
		}
		return arr;
	}
	
	public static Address addAddress() {
		Address a = new Address();
		System.out.println("Enter Address details : ");
		System.out.println("Enter City : ");
		String city = sc.nextLine();
		System.out.println("Enter Country : ");
		String country = sc.nextLine();
		System.out.println("Enter Zip : ");
		int zip = sc.nextInt();
		a.setCity(city);
		a.setCountry(country);
		a.setZip(zip);
		return a;
	}
}