package com.array;

import java.util.Arrays;

public class Twosum {

	    public static void main(String args[]){
	       int nums[] = {2,7 ,11,15};
	       Twosum s = new Twosum();
	       s.twoSum(nums, 9);
	    }
	    

		public int[] twoSum(int[] nums, int target) {
			for(int i=0;i<nums.length;i++) {
				
			if(target>nums[i]) {
				int a = nums[i];
				int b = nums[i+1];
				int c =  a+b;
				
			}
			}
			return nums;
			
		}
	}

