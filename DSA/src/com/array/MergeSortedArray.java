package com.array;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int nums1[] = {-1,0,0,3,3,3,0,0,0};
		int nums2[] = {1,2,2};
		int m = 6;
		int n = 3;
		int ans [] =merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(ans));
		
	}
public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	//Arrays.sort(nums1);
	//Arrays.sort(nums2);
	int p= 0;
	for(int i=m;i<(m+n) && p<nums2.length;i++) {
			nums1[i] = nums2[p++];
	}
	Arrays.sort(nums1);
	return nums1;
	
}
}
