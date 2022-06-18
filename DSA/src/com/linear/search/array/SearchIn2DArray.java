package com.linear.search.array;

public class SearchIn2DArray {

	public static void main(String[] args) {
int a[][] = {{1,2,34,4,5},{54,78,89},{52,45,87,90,101}};
int target=34;
Boolean f = searchValue(a,target);
System.out.println(f);
	}

	private static boolean searchValue(int[][] a, int target) {

		//use jagged array concept here
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				//search value prsenet in array or not
				if(a[i][j]==target) {
					return true;
				}
			}
		}
		return false;
	}

}
