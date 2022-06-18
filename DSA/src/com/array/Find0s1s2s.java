package com.array;
// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


public class Find0s1s2s {


	    
	    public static void main (String[] args) throws IOException {
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
	            int res[] =sort012(arr, n);
	            System.out.println(Arrays.toString(res));
	      	  
	        }
	    

	  // } Driver Code Ends

	   private static int[] sort012(int a[], int n)
	   {

	 int temp [] = new int[n];
	       int startIndex =0;
	       int lastIndex = a.length-1;

	       for(int i =0; i<a.length; i++){
	           if(a[i]==0){
	               temp[startIndex] = a[i];
	               startIndex++;
	           }
	           if(a[i]==2)
	           {
	               temp[lastIndex] = a[i];
	               lastIndex--;
	           }
	       }


	       for(int i = startIndex; i<=lastIndex ; i++){
	           temp[i]= 1;
	       }
	       
	       for(int i =0; i<a.length; i++)
	       {
	           a[i] = temp[i];
	       }
	      
	       return a;
	   }
	}

