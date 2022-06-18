package com.string;

public class StringExample {

	//Need of String -> it makes your application secured. eg-bank application.
	//Defination of String -> 1. its object that represent sequence of charcater value. 
	//example -> ABCD = "ABCD"
	//2. String is immutable -> it can not changed value. 
	//-> SCP - String constant pool -> it is in inside heap memeory, it is place in heap memory where values of all the string stored. 
	
	public static void main(String[] args) {
		String name = "vijay";
		name = name.concat("Inje"); //concat - join two words
		System.out.println(name);
		
		String name1 = new String("Ajay");
		name1.concat("codeouter");
		System.out.println(name1);
		
		//Example 1 ->
		String m = new String("ABC");
		String n = new String("ABC");
		String p = "ABC";
		String q = "ABC";
		//Heap Area - m -> ABC ,n -> ABC 
		//SCP Area  -p, q -> ABC
		
		//Example 2 -> 
		String u = new String("XYZ");
		u.concat("PQR");
		u = u.concat("LMN");
		//Heap Area - u -> XYZ,u->XYZLMN
		//SCP Area  - XYZ, PQR ,LMN
		System.out.println(u);
		
		//Example 3->
		String food1 = new String("Mango");
		food1.concat("Apple");
		String food2 = food1.concat("Banana");
		food2.concat("Orange");
		//Heap Area - fodd1-> Mango , food2 -> MangoBanana
		//SCP Area  -  Mango , Apple , banana ,Orange
		System.out.println(food1);
		System.out.println(food2);
		
		// by == and equals
		String food3 = new String("Mango");
		String food4 = new String("Mango");
		System.out.println(food3==food4); // its pointing to refernces of variables
		System.out.println(food3.equals(food4)); // its point to value of variables
		
	}

}
