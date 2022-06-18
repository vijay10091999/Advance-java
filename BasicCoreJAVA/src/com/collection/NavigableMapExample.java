package com.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		NavigableMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(1,"Ajay");
		t.put(0, "Biaja");
		t.put(3, "Sonlai");
		t.put(10, "agaga");
		t.put(11, "baha");
        System.out.println("Elemts : " + t);
		
		System.out.println("Ceiling  : " + t.ceilingKey(9));
		System.out.println("Higher  : " + t.higherKey(9));
		System.out.println("Floor : " + t.floorKey(10));
		System.out.println("Lower : " + t.lowerKey(6));
		System.out.println("Poll First : " + t.pollFirstEntry());
		System.out.println("Poll last : " + t.pollLastEntry());
		System.out.println("Descending set" + t.descendingMap());
	

	}

}
