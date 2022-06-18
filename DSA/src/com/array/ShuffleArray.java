package com.array;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int a[] = {2,5,1,3,4,7};
       int ans [] =shuffle(a,n);
       System.out.println(Arrays.toString(ans));
	}
	 public static int[] shuffle(int[] a, int n) {
		   int[] tmp = new int[2*n];
	        for(int i = 0; i < n; i++){
	            tmp[(2*i)+1] = a[n + i];
	            tmp[2*i] = a[i];
	        }
	        return tmp;
	    }
}
