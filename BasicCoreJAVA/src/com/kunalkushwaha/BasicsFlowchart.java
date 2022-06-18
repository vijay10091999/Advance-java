package com.kunalkushwaha;

import java.util.Scanner;

public class BasicsFlowchart {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
System.out.println("Enter a salary : ");
int salary = sc.nextInt();
if(salary>10000) {
	 salary = salary+2000; 
	System.out.println("Result is :"+salary);
}else {
	salary = salary+1000; 
	System.out.println("Result is :"+salary);
}
	}

}
