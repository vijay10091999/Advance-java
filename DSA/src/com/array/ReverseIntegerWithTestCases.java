package com.array;

public class ReverseIntegerWithTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 123 ;
		int ans =reverse(x);
		System.out.println(ans);
	}
	 public static int reverse(int x) {
	      int res=0 ;
	      while(x != 0) {
	    	  if(Integer.MAX_VALUE/10<x || Integer.MIN_VALUE/10>x) {
	    		  return 0;
	    	  }
	      int d = x % 10;
	      res = res * 10 + d;
	      x  = x/10; 
	    }	       
	      x = x/10;
	        
	           return res;
	    }
}
