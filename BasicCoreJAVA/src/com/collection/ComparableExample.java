package com.collection;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
   //it has internally comparableto method
		//comparable udse internally compre to method
		
		TreeSet <String> t = new TreeSet<>();
		t.add("K");
		t.add("A");
		t.add("J");
		t.add("A");
		t.add("L");
		System.out.println(t);
		System.out.println("K".compareTo("J")); //object1 after object2 = +ve result
		System.out.println("A".compareTo("L")); //object1 BEFORE object2 = -ve result
		System.out.println("A".compareTo("A")); //object1 Equal object2 = +ve result

		
		
	}

}
