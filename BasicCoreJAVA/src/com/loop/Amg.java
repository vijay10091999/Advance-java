package com.loop;

public class Amg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int end = 20000;
		
	
		for(int no = start; no<=end; no++) {
			int sum = 0;
			int c = no;
			int digit = String.valueOf(c).length();
			
			for(;c!=0;c/= 10) {
				int r = c%10;
				sum += Math.pow(r,digit);
			}
			if(sum == no) {
				System.out.println(no);
			}
		}
	}

}
