package com.basicjava;

public class Wrapper {

	public static void main(String[] args) {
  //wrapper class -> used to convert primitive data type into object and viceversa.
		//used -> serialization , synchronization , collection framework
		//its immutable -> it cant change value
		//its has null value byt primitive dont have null value
		
		int a = 34;
		//autoboxing -> converting primitive into objects
		Integer b = a;
		//b = null;
		System.out.println(b);
		
		short c = 45;
		Short t = c;
		System.out.println(t);
		
		System.out.println(b.equals(c));
		
		//unboxing -> converting objects into primitive
		int s = b;
		System.out.println(s);
		
		
	}

}
