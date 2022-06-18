package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the element :");
//		int n=sc.nextInt();
//		System.out.println("enter array :");
//		int[] a=new int[n];
//		for(int i=0;i<n;i++){
//			a[i]=sc.nextInt();
//		}	
		int a[] = {1,2,3,4};
		//int a1[] = RunningSum(a);
		int a2[] = runningSum(a);
		System.out.println(Arrays.toString(a2));
		
	}

	private static int[] RunningSum(int[] a) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
				sum = sum+a[i];
				 a[i] =sum;
				
		}
		return a ;
	
	}
	
	public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        // Initialize first element of result array with first element in nums.
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}


