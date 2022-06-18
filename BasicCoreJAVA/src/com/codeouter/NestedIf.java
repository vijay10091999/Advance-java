package com.codeouter;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//NestedIf - Check Conditions one After another
		int a = 23;
		int b = 89;
		if(a==23) {
			if(b==89) {
				System.out.println("Both Conditions are True");
			}
		}
		//Task -> Check Number is greater than 20 and Number is Even 
		int num = 40;
		if(num>20) {
			if(num%2==0) {
				System.out.println("Number is greater than 20 and Number is Even");
			}
		}
		
	}

}
