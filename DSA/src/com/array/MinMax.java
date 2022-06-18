package com.array;

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class pair  
	
	{  
	    long first, second;  
	    
	    //created constructor for pass min and max value
	    public pair(long first, long second)  
	    {  
	        this.first = first;  
	        this.second = second;  
	    }  
	}

	class MinMax {
		public static void main(String[] args) throws IOException
		{

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
	    	
	    	//creating object for access the method
	            Compute obj = new Compute();
	            
	            //store in variable
	            pair product = obj.getMinMax(arr, n); //access the constructor parameter value 
	            System.out.println(" Minimum value : "+product.first+" "+" Maximum value : "+product.second);
	            
	        }
		}
	

	class Compute 
	{
		// logic for find max and min number
		static pair getMinMax(int[] arr, long n) {
			// intially set or pass value as zero for max and min
			pair p = new pair(0, 0);

			// store in variable
			p.first = arr[0];
			p.second = arr[0];

			for (int i = 0; i < n; i++) {

				// logic for min
				if (p.first > arr[i]) {
					p.first = arr[i];
				}

				// logic for max
				if (p.second < arr[i]) {
					p.second = arr[i];
				}
			}
			return p;

		}
	    }



