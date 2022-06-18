package com.codeouter;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ifelseStatement - we want to test conditions when it has both possibilities.
		// test number is +ve or -Ve 
		int number = 23;
		if(number > 0) {
			System.out.println(number+" is positive");
		}else{
			System.out.println(number+" is negative");

		}
		
		//task -> Check Number is Even or Odd
		int num = 34;
		if(num%2==0) {
			System.out.println(number +" is Even");
		}else {
			System.out.println(number+" is Odd");
		}
	}

}
