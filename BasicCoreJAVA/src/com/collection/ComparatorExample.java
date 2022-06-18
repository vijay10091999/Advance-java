package com.collection;

import java.util.Comparator;
import java.util.TreeSet;
class DescendingOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
//		if(i1<i2) {
//			return 1;
//		}else if(i1>i2) {
//			return -1;
//			}else {
//				return 0;
//			}
//		}
	return i2.compareTo(i1);
}
}

public class ComparatorExample {

	public static void main(String[] args) {

		//comprarator is uesd to do customize sorting order.
		//internally comapre used compare method
		TreeSet <Integer> t = new TreeSet<>(new DescendingOrder());
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(0);
		t.add(40);
		t.add(50);
		System.out.println(t);

	}

}
