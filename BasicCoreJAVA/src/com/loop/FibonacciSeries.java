package com.loop;

public class FibonacciSeries {

	public static void main(String[] args) {
		//fibonnci series - 0,1,1,2,3,5,8,13...so on
		String series = "";
		int num1 = 0, num2 =1 , num3 ;
		for(int i = 2;i<10;i++) {
			num3 = num1+num2;
			//System.out.println(num3);
		series = series + " " + num3;
			num1 = num2;
			num2 = num3;
			
		}
		
	System.out.println(series);
		//num1 = 0 , num2 = 1 , num3 = 0+1 = 1 
		//num1 = 1 , num2 = 1 , num3 = 1+1 = 2 
		//num1 = 1 , num2 = 2 , num3 = 1+2 = 2 
		

	
	}

}
