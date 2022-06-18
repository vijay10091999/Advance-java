package com.array;

import java.util.Arrays;

public class ReverseOfArrayWithoutForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
 //swap(arr,0,4);
// System.out.println(Arrays.toString(arr));
 
 reverse(arr);
 System.out.println(Arrays.toString(arr)); 
	}
	
	 static void reverse(int arr[]) {
		int start =0;
		int end = arr.length-1;
		while(start<end) {
			swap(arr,start,end);
				start++;
				end--;
			
		}
	}
 static void swap(int[] arr, int index1, int index2) {
	 int temp = arr[index1];
	 arr[index1]=arr[index2];
	 arr[index2]=temp;	 
 }
}
