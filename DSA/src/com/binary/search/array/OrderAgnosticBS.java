package com.binary.search.array;

public class OrderAgnosticBS {

	public static void main(String[] args) {

		int a[] = {-18,-23,14,14,14,20,36,48};
		int x = 14
				;
		int ans =OrderAgnostic(a,x);
		System.out.println(ans);
	}

	private static int OrderAgnostic(int[] a, int x) {
		
		  int s = 0;
		  int e = (a.length)-1;
		//find wheather the array is sorted in accsending or descending
		boolean isAsc = a[s]<a[e];	
		while(s<=e) {
			 // int m = (s+e)/2; -> it might be exxceed the range over you take large number
			  int m = s+(e-s)/2;
			  
			  if(a[m]==x) {
				  return m;
			  }
			  if(isAsc) {
				  if(x<a[m]) { //
					   e= m-1;
				  }else {
					  s = m+1;
				  }
			  }else {
				  if(x>a[m]) { //
					   e= m-1;
				  }else{
					  s = m+1;
				  }
			  }

	}
		return -1;
	}
}

	
