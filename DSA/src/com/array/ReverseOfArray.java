package com.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,40,50,60};
		int size = arr.length-1;
		 Method3(arr,size);
		int[] res1 = Method1(arr,size);		
		System.out.println(Arrays.toString(res1));
		
		int[] res2 = Method2(arr);
		System.out.println(Arrays.toString(res2));
		
		
		
	}

	private static void Method3(int[] arr, int size) {
		for(int i=size;i>=0;i--) {
			System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
	}

	private static int[] Method2(int[] arr) {
       Collections.reverse(Arrays.asList(arr));
		return arr;
	}

	private static int[] Method1(int[] arr, int size) {
		int temp;
		for(int i=0;i<=size;i++) {
			temp = arr[i]; 
			arr[i] = arr[size]; 
			arr[size]=temp; 
			size--;
		}
		return arr;
	}
	
	

}
