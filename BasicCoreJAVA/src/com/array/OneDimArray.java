package com.array;

import java.util.Scanner;

public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = new int[5];
arr[0] = 10;
arr[1] = 20;
arr[2] = 33;
arr[3] = 40;
arr[4] = 55;
//for loop
for(int i=0;i<arr.length;i++) {
	System.out.println("by loop : "+arr[i]);
}
//for each
for(Integer i : arr) {
	System.out.println("OneDimArray : "+i);
}
// Task : sum of all numbers in array using both for loop and for each
int sum1 = 0,sum2=0;
for (int i = 0; i < arr.length; i++) {
	     sum1 = sum1 + arr[i];
}
System.out.println("Sum1 : " + sum1);  
// for each
for(Integer ele : arr) {
  	  sum2 = sum2 + ele;
}
System.out.println("Sum2 : " + sum2);
	
	 for (int i = 0; i < arr.length; i++) {
 	    if(arr[i]%2==0) {
 	    	System.out.println("even no at  "+ i + " - " + arr[i]);
 	    }
   }
	 
	 //task :
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter your Number");
	 int no = s.nextInt();
	 System.out.println("Enter your String");

	 for(int i=0;i<no;i++) {
		 String c = s.next();
		 int res = findlength(c);	
		 System.out.println("Length of string : "+res);
	 }
	 
}
	private static int findlength(String c) {
		return c.length();
	}
}
