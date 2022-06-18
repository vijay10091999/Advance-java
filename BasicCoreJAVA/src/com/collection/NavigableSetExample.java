package com.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
//solving the problem of sorted set
		NavigableSet<Integer> n = new TreeSet<>();
		n.add(10);
		n.add(20);
		n.add(40);
		n.add(50);
		n.add(85);
		n.add(90);
		System.out.println(n);
		System.out.println(n.ceiling(33)); //elemment  >= object
		System.out.println(n.floor(33));// elemnet <= object
		System.out.println(n.higher(33));//element > object
		System.out.println(n.lower(33)); //element < object
		System.out.println(n.descendingSet());
	}

}
