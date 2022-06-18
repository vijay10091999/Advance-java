package com.array;

import java.util.Arrays;

public class BuildArrayFromPermutation {

	public static void main(String[] args) {

		int a[] = {0,2,1,5,3,4};
		int ans [] = PrintArray(a);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] PrintArray(int[] a) {
		int[] tmp= new int[a.length];
		for(int i=0;i<a.length;i++) {
			tmp[i] = a[a[i]];
			
		}
		return tmp;
		
	}

}
