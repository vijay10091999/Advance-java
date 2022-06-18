package com.kunalkushwaha;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		  boolean flag = false;
		for (int i = 2; i <= Math.sqrt(n);i++) {
		      // condition for nonprime number
		      if (n % i == 0) {
		        flag = true;
		        break;
		      }
		    }
		if (!flag)
		      System.out.println(n + " is a prime number.");
		    else
		      System.out.println(n + " is not a prime number.");
		  }
	

}
