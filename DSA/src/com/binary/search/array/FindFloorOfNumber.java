package com.binary.search.array;

public class FindFloorOfNumber {
	// Easy : To find floor of number in array
		// Floor no = greatest element from array which smaller or equal >= target ele
		// ex. a = [2,,5,9,14,19]
		// target = 13
		// floor no = sub array which ele <= 13 = [2,5,9] = (9<=13) => greatest no => 9

		// here at last condition like - end <= target <= start => end is smaller element than end so return end
		// T.C = O(logn)

	public static void main(String[] args) {
		int a[] = {2,3,5,9,14,16,18};
		int x =15;
		int ans =FindCeilingElement(a,x);
		System.out.println("Ceilig Number of "+x+" is : "+ans);

	}

	private static int FindCeilingElement(int[] a, int x) {
		  int s = 0;
		  int e = (a.length)-1;
		  
		// if target number is smallest than array element
			if(x < a[a.length-1]) {
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
					  
					  return a[m]; // ans found
				  }
				  
		
		}
		return a[e];
	}

}
