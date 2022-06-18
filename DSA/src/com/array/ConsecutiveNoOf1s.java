package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveNoOf1s {
	

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	 int [] a = {0,0,0,0,1}; 
//		 int size = array.length;
//		 int a1 [] = find1s( array) ; 
//		 System.out.println(Arrays.toString(a1));
	
		 int start = 0;
			int end = a.length-1;
			int i =0;
			List<Integer> count = new ArrayList<Integer>();
			int c=0;
			while(start <= end) {
				if(a[i] == 0) // if we found zero elemts  then we can skip the elemenet and move next index 
							// and stored count as zero 
				{
					i++;
					start++;
					c=0;
					count.add(c);
				}
				else { // if we found one elemnt then store count as one again go next index and if you found one again store count as onne 
					
					i++;
					start++;
					c++;
					count.add(c);
				}
			}
			int d = count.stream().max((o1,o2)->(o1.compareTo(o2))).get(); //find maximum number of count 1s
			System.out.println(d);
		 
	}
//
//	private static int[]  find1s(int[] a) {
//
//		int size = a.length;
//        int i , c=0, v ;
//        for ( i = 0 ; i < size ; i++ ) { 
//        	v=a[i];
//        	if(v==1) {
//        		c++;
//        	}
//        }
//		return arr;
//	}
}