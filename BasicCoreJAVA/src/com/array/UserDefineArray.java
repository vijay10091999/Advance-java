package com.array;

import java.util.Scanner;

class Student{
	int sid;
	String sname;
	
	public Student(int sid,String sname) {
		System.out.println("Student id : " + sid + " name is : " + sname);
	}
}

public class UserDefineArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of student : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		Student[] s = new Student[no];
		for(int i=0; i<no;i++) {
			System.out.println("Enter stud id : ");
			int id = sc.nextInt();
			System.out.println("Enter stud Name : ");
			String name = sc.next();
			s[i] = new Student(id,name); 
		}
	}

}
