package com.collection;

import java.util.HashSet;
class Computer4{
	int cid;
	String cBrand;
	public Computer4(int cid, String cBrand) {
		super();
		this.cid = cid;
		this.cBrand = cBrand;
	}
	@Override
	public String toString() {
		return "Computer4 [cid=" + cid + ", cBrand=" + cBrand + "]";
	}
	
}

public class HashSetExample {
public static void main(String[] args) {
	//hash ,hash table,load factor,slots
	//hashset class is use to create collection that use hash table for storage
	//loadfactor - after filling all objects how much ratio a new hash set object will be created
	//deafault capacity is 60 
	
	//uses - search elemenet from larage dataset
	//disadvnage - not able to idenetity first and last element
	
	//1.hash set contain unique element
	//2. insertation has not preserve
	HashSet h =new HashSet();
	h.add("vijay");
	h.add("ajay");
	h.add("sonal");
	h.add("kajol");
	System.out.println(h);
	System.out.println(h.contains("ajay"));
	h.remove("kajol");
	System.out.println(h);
	System.out.println(h.size());
	
	HashSet<Computer4> c4 = new HashSet<>();
	c4.add(new Computer4(1,"DELL"));
	c4.add(new Computer4(2,"HP"));
	c4.add(new Computer4(3,"MICROSOFT"));
	c4.add(new Computer4(4,"MAC"));
	
	System.out.println(c4);
}
}
