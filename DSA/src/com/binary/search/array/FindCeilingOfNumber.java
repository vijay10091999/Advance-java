package com.binary.search.array;

public class FindCeilingOfNumber {
	    // Easy : To find ceiling of number in array
		// Ceiling no = smallest element from array which largest or equal >= target ele
		// ex. a = [2,,5,9,14,19]
		// target = 13
		// ceiling no = sub array which ele >= 13 = [ 14,19] = (14>=13) => small no => 14
		
		// here at last condition like - end <= target <= start => start is greater elemnt than end so return start
		// T.C = O(logn)

	public static void main(String[] args) {
		int a[] = {2,3,5,9,14,16,18};
		int x =17;
		int ans =FindCeilingElement(a,x);
		System.out.println("Ceilig Number of "+x+" is : "+ans);

	}

	private static int FindCeilingElement(int[] a, int x) {
		  int s = 0;
		  int e = (a.length)-1;
		  
		// if target number is smallest than array element
			if(x > a[a.length-1]) {
						return -1;
			}
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
				  
		
		}
		return a[s];
	}

}
