package com.binary.search.array;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,7,7,8,8,10};
		int x =6;
		int a1[] =searchRange(a,x);
		System.out.println(Arrays.toString(a1));
	}
	
	//Method 1 : without Binary Search
	 public static int[] searchRange(int[] a, int x) {
	        int tmp[] = new int[2];
	        tmp[0] =-1;
	        tmp[1] =-1;
	        
			for(int i=0;i<a.length;i++) {
				if(a[i]==x) {
	                 tmp[1]=i; 
				}
			}
	        for(int j=a.length-1;j>=0;j--){
	            if(a[j]==x) {
	                 tmp[0]=j; 
	            }
	        }
	        
	        
	        
	        return tmp;
	    }
	 
		//Method 1 : with Binary Search

	 

}
