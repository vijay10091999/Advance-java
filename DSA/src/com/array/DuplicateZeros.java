package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,0,0,3};
		 //duplicateZeros1(arr);
		duplicateZeros(arr);
	}	

	private static void duplicateZeros(int[] a) {
		ArrayList<Integer> l = new ArrayList<Integer>(a.length);
		for(int i=0;i<a.length;i++) {
			if(l.size() < a.length) {
				if(a[i]==0) 
					l.add(0);
				  l.add(a[i]);
			}
	    }
		System.out.println(l);
	}
	
//	private static void duplicateZeros1(int[] a) {
//		int t[] = new int[a.length];
//		
//		for(int i=0;i<a.length;i++) {
//			int p=i;
//			if(p<=a.length) {
//			    if(a[i]==0) {
//					t[p] = a[i];
//					t[++p]=0;
//				}
//			    else {
//					t[++p] = a[i];
//					p=p+1;
//			    }
//			}
//			
//	    }
//		System.out.println(Arrays.toString(t));
//	}
}
