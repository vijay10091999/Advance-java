package com.linear.search.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TragetIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 34;
		int a[] = {11,34,34,78,34,89,67};
		
		//targetindex(a,x);
		int [] arr =targetindices(a,x);
		System.out.println(Arrays.toString(arr));
	}

	//without used java 8
	private static int[] targetindices(int[] a, int x) {
		int c=0;
		for(int i=0;i<a.length;i++) { 
            if (a[i] != x) {  
                  c++;
             }
		}
		int[] tmp = new int[a.length-c];
		int p=0;
		for(int j =0;j<a.length;j++) {
			if(a[j]==x) {
			tmp[p++] = j;
			}
		}
		return tmp;
	}

	
	// using java 8
	private static void targetindex(int[] a, int x) {

		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				l.add(i);

			}

		}
		System.out.println(l);

	}
	
	
	
}
