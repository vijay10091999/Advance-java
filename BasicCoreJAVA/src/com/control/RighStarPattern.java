package com.control;

public class RighStarPattern {
 public static void right() {
	 int n = 5;  // maximum no of stars
		int row,column,space;
		
		for(row=1;row<=n;row++) {
			
			for(column=1;column<=row;column++) {
				System.out.print("*");
			}
			
		
		System.out.println();
		
 }
}
}
