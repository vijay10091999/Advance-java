package com.string;

import java.util.StringTokenizer;

public class SumOfTokens {

	public static void main(String[] args) {
		//TASK :
		// input as "10 20 30 40 50"
		
		StringTokenizer s = new StringTokenizer("10 20 30 40 50"," ");
		//Method 1 :
		int sum = 0;
		while(s.hasMoreTokens()) {
			//convert String into Integer
			int n = Integer.parseInt(s.nextToken());
			sum = sum + n ;
		}
		System.out.println("Sum :" + sum);
		
		//Method 2:
		String str = "10,20,30,40,50";
		String[] result =str.split(",");  //using split method
		int sum1 =0;
		 for (String s1 : result) {
				System.out.println(s1); 
				int n = Integer.parseInt(s1);
				sum1 = sum1 + n ;
		}
			System.out.println("Sum :" + sum1);
		 
		
		
		
	}

}
