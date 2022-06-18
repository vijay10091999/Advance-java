package com.linear.search.array;

public class SearchInRange {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int start= 1;
		int end = 3;
		int x= 54;
		int a[] = {11,34,56,78,54,89,67};
		
		int ans = SearchRange(a,start,end,x);
		System.out.println(ans);
	}

	private static int SearchRange(int[] a, int start, int end,int x) {
	for(int i=start;i<end;i++) {
		if(a[i]==x) {
			return i;
		}
	}
	return -1;
	}

}
