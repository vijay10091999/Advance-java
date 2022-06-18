package com.loop;

public class AmstrongNumber {

	public static void main(String[] args) {
		// 153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153
		// abcd...= a ^n + b^n+....
		int n = 1634;
		double result = 0;
		for(int i = n;i!=0;i/=10) {
			int r = i%10;
			//result = result + (r*r*r);
			result = result + Math.pow(r, 4);  // for all digit 
			
		}
		if(result==n) {
			System.out.println("Amstrong number is correct");
		}else {
			System.out.println("Amstrong number is not correct");
		}
		
		//n = 153, r = 153%10 = 3 , result = 27 -> n = 153/10 = 15
		//n = 15 , r = 15%10 = 5 , result = 27+(125) =  152 , n = 15/10 = 1
		//n = 1 , r = 1%10 = 1 , result = 1+(152) =  152 , n = 1/10 = 0
		
	}

}
