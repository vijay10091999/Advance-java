package com.array;

import java.util.Arrays;

public class SimpleArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {2,4,3,5};
//For-each Loop and for-each for Java Array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i:arr)  
			System.out.print(i + " "); 
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		int res = min(arr);
		System.out.println("Minimum Number : "+res);
		
		max(arr);
	}

	private static void max(int[] arr) {
		int max=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(max<arr[i]) 
		   max=arr[i];  
		System.out.println("Maximum Number : "+max);
	}

	private static int min(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i]) 
		   min=arr[i];  
		return min;
	}

}
