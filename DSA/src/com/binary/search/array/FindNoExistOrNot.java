package com.binary.search.array;

public class FindNoExistOrNot {

	//if order is in Array in Soring mannerr
	public static void main(String[] args) {
int a[] = {2,4,6,9,11,12,14,20,36,48};
int x = 2;
int ans =FindTargetElement(a,x);
System.out.println(ans + " is index on "+x+" number presnt in array");

	}

	private static int FindTargetElement(int[] a, int x) {
  int s = 0;
  int e = (a.length)-1;
while(s<=e) {
	 // int m = (s+e)/2; -> it might be exxceed the range over you take large number
	  int m = s+(e-s)/2;
	  if(x<a[m]) { //
		   e= m-1;
	  }else if(x>a[m]) {
		  s = m+1;
	  }else {
		  
		  return m; // ans found
	  }
	  
	  //if array is not in sortrf or in decresing order
		/*
		 * if(x>a[m]) { // e= m-1; }else if(x<a[m]) { s = m+1; }else {
		 * 
		 * return m; // ans found }
		 */
}
return -1;	 //elemnt is not presnet in array
  }

}
