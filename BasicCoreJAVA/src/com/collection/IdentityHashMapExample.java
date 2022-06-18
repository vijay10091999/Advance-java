package com.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we have two ways to find identity 
		//1.equals method 
		//2/==
		//equals = used to return true if object content is same.
		//== is use to return if object refernce is same.
		
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("ajay", 10);
	    m.put("vijay", 20);
	    m.put("sonali", 10);
	    m.put("kajal", 10);
	    System.out.println(m);
	    
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
				;
		
		m1.put(i1,"ajay");
		m1.put(i2,"vijay");
	    System.out.println(m1);
	    
	    IdentityHashMap<Integer, String> m2 = new IdentityHashMap<Integer, String>();
		
	    Integer j1 = new Integer(10);
		Integer j2 = new Integer(10);
	    
	    m2.put(j1,"ajay");
		m2.put(j2,"vijay");
	    System.out.println(m2);

	}

}
