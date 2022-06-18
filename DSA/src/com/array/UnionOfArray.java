package com.array;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9; 
		int m=3;
		int a[] = new int[n];
		int b[] = new int[m];
		int a1[] = {1,2,3,4,5,8,9,8,8};
		int b1[] = {1,2,3};
		int n2 = UnionArray(a1,n,b1,m);
		System.out.println(n2);
		
	}

	private static int UnionArray(int[] a, int n, int[] b, int m) {

	       HashSet<Integer> set1 = new HashSet<>();

	       for(int i=0;i<n;i++){
	           set1.add(a[i]);
	       }

	       for(int i=0;i<m;i++){
	           set1.add(b[i]);
	       }


	       return set1.size();
	   }

}
