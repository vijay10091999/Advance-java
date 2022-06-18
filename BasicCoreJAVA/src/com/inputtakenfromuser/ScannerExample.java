package com.inputtakenfromuser;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//Four ways to take input from user
		//use scanner keyword
		//use command line argument
		//use bufferReader with input Streamreader
		//use BufferRedear with file reader
		
		Scanner sc = new Scanner(System.in);
		//create student profile
//		int rollno = sc.nextInt();
//		String sname = sc.next();
//		float smarks = sc.nextFloat();
//		
//		System.out.println("student rollno is :"+rollno);
//		System.out.println("student name is :"+sname);
//		System.out.println("student marks is :"+smarks);
//		
		System.out.println("==========================================================");
		//Task -> Addition of two numbers
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a + b;
		System.out.println("Addition of a and b is :"+result);
		
	}

}
