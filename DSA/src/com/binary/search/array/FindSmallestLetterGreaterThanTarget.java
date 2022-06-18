package com.binary.search.array;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] l = {'c', 'f', 'j'};
		char x  = 'c';
		char ans =nextGreatestLetter(l,x);
		System.out.println("Ceilig Number of "+x+" is : "+ans);
	}

	private static char nextGreatestLetter(char[] l, char x) {
		 int s =0;
			int e = l.length -1;
			if(x > l[l.length-1]) {
									return l[0];
						}
			 while(s<=e) {
				  int m = s+(e-s)/2;
				  if(x<l[m]) { //
					   e= m-1;
				  }else if(x>=l[m]) {
					  s = m+1;
				  }else {
					  
					  return l[m]; // ans found
				  }
				  
		
		}
		return l[s % l.length];
			
		}
	    }
