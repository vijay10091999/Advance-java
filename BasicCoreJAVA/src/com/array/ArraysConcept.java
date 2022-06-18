package com.array;

import java.util.Arrays;

public class ArraysConcept {
	// java.util.Arrays class contains various static methods for manipulating arrays. 
	// The manipulation includes searching, sorting, list view of an array and others.
	// it is used in collections
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,8,6,0,5,2};
		
		//sort array of element
		Arrays.sort(arr);
		System.out.println("sorted array : "+Arrays.toString(arr));
		
		
		
		//for binaray search
		int search = 3;
		int index = Arrays.binarySearch(arr, search);
		System.out.println(index);
		
		
		
		// copy array till index
		int[] len = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(len));
		
		       // fill value in array all
				Arrays.fill(arr, 10);
				System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

	
	
}
