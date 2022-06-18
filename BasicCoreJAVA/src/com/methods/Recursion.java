package com.methods;

public class Recursion {

	public static void main(String[] args) {
	
        //A method in java that calls itself is called recursive method.
		//Advantages:
		//1. reduce the length of code
		//2. the code may be easy to write.
		
		System.out.println(fact(5));
		
	}

	private static int fact(int i) {
	
		if(i==0 || i==1) {
			return 1;
		}else {
			return (i*fact(i-1));
		}
		
	}

	//f(0) = 1 , f(1) = 1
	//f(2) = 2*f(1) = 2
	//f(3) = 3 * f(2) = 6
	//f(4) = 4 * f(3) = 24
	//f(5) = 5 * f(4) = 120
	
}
