package com.loop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for loop is used when number of iterataion of program is fixed.
//repeat multiple times
		//  Generated student id in Student class.
//		for (int stud_id = 0; stud_id < 5; stud_id++) {
//            System.out.println("Student " + stud_id + " generated");
//        }
		
		String even = "";
		String odd = "";
		for(int i = 0;i<10;i++) {
		        	if(i%2==0) {
		        		even = even + " " + i;
		        	}else {
		        		odd = odd + " " + i;	
		        	}
		        }
		        System.out.println("Even No:"+even);
		        System.out.println("odd No :"+odd);
	}

}
