package com.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		//its class allows you to break a string into tokens(words).
		
		StringTokenizer s = new StringTokenizer("i am vijay"," ");
		while(s.hasMoreTokens()) { 
			System.out.println(s.nextToken());
		}
		
		StringTokenizer s1 = new StringTokenizer("i am Ankit"," ");
		while(s1.hasMoreElements()) { 
			System.out.println(s1.nextToken()); 
		}
		
		StringTokenizer s2 = new StringTokenizer("i,am ,MAYANK"," ,");
		System.out.println("counting "+s2.countTokens());
		
		
		
	}

}
