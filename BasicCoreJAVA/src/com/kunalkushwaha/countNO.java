package com.kunalkushwaha;

import java.util.Arrays;
import java.util.Scanner;

public class countNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number : ");
		//int n = sc.nextInt();
		int n=24445;
		//	1 3 7 7
																//	0 1 2 3
		int c= 0;											//1377 % 10 = 137
	while(n>0) {
		int rem = n%10;
		if(rem==4) {
        c++;
		}
		n=n/10;

	}
	System.out.println("Count No is :"+c);

	
	}

}
