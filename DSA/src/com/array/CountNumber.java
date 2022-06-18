package com.array;
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
//Problem : find count number
public class CountNumber {

	    public static void main(String args[]) throws IOException {
	    	
	    	//take input from user
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter thr elements of array :");
	    	
	    	//take number how much elemnt do you want in array
	    	int n = sc.nextInt();
	    	//
	    	
	    	
	    	//element put in array
	    	int arr[] = new int[n];
	    	  System.out.println("Enter the elements :");
	    	  
	    	  //take array element one by one till n
	    	for(int i = 0;i<n;i++) {
	          
    	        arr[i] = sc.nextInt();
    	    }
	    	System.out.println("Enter the number which count you want :");
	    	
	    	//take x value for find count of number which you give a x value
            int X = sc.nextInt();
            
            //calling method by static method
	    	   int a =findFrequency(arr,X ); //return value save in a 
	    	   System.out.println("Count Number " +X+ " is:"+a); // print a value
	        }

	
	 // } Driver Code Ends


	    //logic for count number
	 private static int findFrequency(int A[], int x){
	        int c=0; //intially take count is zero
	        for(int i=0;i<A.length;i++){
	            if(x==A[i]){ // compare x value with arrays elements one by one
	                c++;
	            }
	        }
	        return c; // value return 
	    }
	
	    }
	    

