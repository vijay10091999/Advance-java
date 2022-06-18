package com.collection;

import java.util.LinkedHashSet;
class Computer5{
	int cid;
	String cBrand;
	public Computer5(int cid, String cBrand) {
		super();
		this.cid = cid;
		this.cBrand = cBrand;
	}
	@Override
	public String toString() {
		return "Computer5 [cid=" + cid + ", cBrand=" + cBrand + "]";
	}
	
}
public class LinkedHashSetExample {

	public static void main(String[] args) {
//LinkedLinkedHashSet - to overcome the prblem of LinkedHashSet we used LinkedLinkedHashSet
		//advantage - insertion order is preserve , unique element contain
		//linked LinkedHashSet use in cache memeroy
		//deafault capacity is 16
		LinkedHashSet h =new LinkedHashSet();
		h.add("vijay");
		h.add("ajay");
		h.add("sonal");
		h.add("kajol");
		System.out.println(h);
		System.out.println(h.contains("ajay"));
		h.remove("kajol");
		System.out.println(h);
		System.out.println(h.size());
		
		LinkedHashSet<Computer5> c4 = new LinkedHashSet<>();
		c4.add(new Computer5(1,"DELL"));
		c4.add(new Computer5(2,"HP"));
		c4.add(new Computer5(3,"MICROSOFT"));
		c4.add(new Computer5(4,"MAC"));
		
		System.out.println(c4);
	}

}
