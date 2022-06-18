package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequewithArray {
public static void main(String[] args) {
	//deque is related to double ended queue 
	//insertion and deletion done with both the ends
	Deque<String> d = new ArrayDeque<String>();
	d.offer("sonu");
	d.offer("vijay");
	d.offer("kajol");
	d.offer("sonal");
	System.out.println(d);
	d.addFirst("kajol");
	d.addLast("sonu");
	System.out.println(d);
	d.removeFirst();
	System.out.println(d);
}
}
