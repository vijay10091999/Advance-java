package com.array;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {-4,-1,0,3,10};
		int ans[] = SquaresOfNO(num);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] SquaresOfNO(int[] num) {

		for(int i=0;i<num.length;i++) {
			 num[i] = num[i]*num[i];
		}
		Arrays.sort(num);
		return num;
	}

}
