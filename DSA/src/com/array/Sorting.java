package com.array;


	// { Driver Code Starts
	//Initial Template for Java
	import java.io.*;
	import java.util.*; 


	class Sorting{
	    public static void main(String args[]) throws IOException { 

	    	int arr[] = {1,7,4,5};
	    	
	            int []ans= sortArr(arr);
	         System.out.println(Arrays.toString(ans));
	        
	        
	    }
	    private static  int[] sortArr(int[] arr) 
	    { 
	        int temp;
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	            if(arr[i]>arr[j]){
	                 temp=arr[i];
	                 arr[i] = arr[j];
	                 arr[j]=temp;
	            }
	        }
	        }
	      return arr;  
	    }
	}
	// } Driver Code Ends
	

	//User function Template for Java

	   
	

