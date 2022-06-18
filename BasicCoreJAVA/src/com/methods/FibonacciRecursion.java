package com.methods;

public class FibonacciRecursion {

	public static void main(String[] args) {

		for(int j = 0 ; j<= 6 ; j++) {
			System.out.println(Fibonacci(j));
		}
		
		//f(0) -> 0 , f(1) -> 1 
		//f(2) -> 0+1 -> 1
		//f(3) -> 2+1 -> 3
		// ....
	}

	//Fiboancci -> 0 , 1 , 1 , 2, 3, 5, 8, 13....so on
	private static int Fibonacci(int i) {
	if(i==0) {
		return 0;
		
	}else if(i==1) {
		return 1;
	}else {
		return Fibonacci(i-1) + Fibonacci(i-2);
	}
	}

}
