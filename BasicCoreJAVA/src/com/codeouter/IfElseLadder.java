package com.codeouter;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IfElseLadder Statement -> if we have multiple conditions 
		// to find large number among three numbers 
		
		int a = 12;
		int b = 23;
		int c = 34;
		
		if((a>b) && (a>c)) {
			System.out.println(a+" is largest Number");
		}else if((b>a)&&(b>c)) {
			System.out.println(b+" is largest Number");
		}else {
			System.out.println(c+" is largest Number");
		}
		
		// task -> Student - given exam - Grade A,B,C - Prize(bike,shoes,Book)
		char grade1 = 'A';
		char grade2 = 'B';
		char grade3 = 'C';
		if(grade1=='A') {
			System.out.println("Student will get Bike");
		}else if(grade2=='B') {
			System.out.println("Student will get Shoes");
		}else {
			System.out.println("Student will get Book");
		}
		
		
		
		
	}

}
