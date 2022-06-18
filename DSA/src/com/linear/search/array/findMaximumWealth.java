package com.linear.search.array;

public class findMaximumWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1,2,3},{3,2,1}};
		
		int sum = maximunWealth(arr);
		System.out.println(sum);
	}

	private static int maximunWealth(int[][] a) {
		
		//use jagged array concept here
		int ans = Integer.MIN_VALUE;
				for(int i=0;i<a.length;i++) {
					int sum=0;
					for(int j=0;j<a[i].length;j++) {
						//we have sum of all the elements
						sum += a[i][j];
					}
				//check with all ans who sum is gratear than ans then ans will return
					if(sum>ans) {
						ans = sum;
					}
			}
		

		return ans;
		
		
	}

}
