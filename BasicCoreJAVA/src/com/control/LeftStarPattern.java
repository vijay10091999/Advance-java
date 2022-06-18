package com.control;

public class LeftStarPattern {

	public static void left() {
		int n = 5;  // maximum no of stars
		int row,column,space;
		
		for(row=1;row<=n;row++) {
			for(space=1;space<=(n-row);space++) {
				System.out.print(" ");
			}
			
			for(column=1;column<=row;column++) {
				System.out.print("*");
			}
		
		System.out.println();
		
	}
	}

}