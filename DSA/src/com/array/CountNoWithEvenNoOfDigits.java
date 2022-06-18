package com.array;

public class CountNoWithEvenNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {252};
		int ans = countEvenofdigit(num);
		System.out.println(ans);
	}

	private static int countEvenofdigit(int[] num) {
		int c = 0;
        for (int i = 0; i <=num.length-1; i++) {
        	int cvalue=num[i];
        	
            //find the number of digits 
        	int count = (int) (Math.log10(num[i])+1); // int c = String.valueOf(num[i]).length;
        	
        	//find count of even count of numbers
            if(count%2==0) {
            	c++;
            }
      
         }	
        
      return c;
}
	
	
}

