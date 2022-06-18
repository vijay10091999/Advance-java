package com.string;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		//It is used to construct sequence of characters spreated by delimeter. 
		StringJoiner joiner = new StringJoiner(","); //passing comma as delimeter
		
		joiner.add("Ankit");
		joiner.add("vijay");
		joiner.add("Mayank");
		joiner.add("Sheetal");
		
		System.out.println(joiner);
		
		//creating StringJoiner 
		StringJoiner joiner1 = new StringJoiner(",","{","}"); // (delimeter,prefix,suffix)
		joiner1.add("Mayank");
		joiner1.add("Sheetal");
		
		System.out.println(joiner1);
		
		StringJoiner joiner2 = new StringJoiner(":","{","}"); 
		joiner2.add("Ankit");
		joiner2.add("vijay");
		
		System.out.println(joiner2);
		
		
		//merging two stringJoiner
		StringJoiner merge = joiner1.merge(joiner2);
		System.out.println(merge);
		
	}

}
