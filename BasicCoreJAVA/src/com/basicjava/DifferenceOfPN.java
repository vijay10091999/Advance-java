package com.basicjava;

import java.util.Arrays;

public class DifferenceOfPN {

	public static void main(String[] args) {
		
		//note -> change does not reflected in original value
		//its primitive data type
		int a = 24;
		int b = a;
		System.out.println("intial value : "+a+" "+b);
		b = 56;
		System.out.println("After value : "+a+" "+b);

		//Array - Non -primitive data type
		
		int[] c = {10,20,30,40};
		int[] d = c;
		System.out.println(Arrays.toString(c) + " " + Arrays.toString(d));
		d[1] = 50;
		System.out.println(Arrays.toString(c) + " " + Arrays.toString(d));
		
	}

}
