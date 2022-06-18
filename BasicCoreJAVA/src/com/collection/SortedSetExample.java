package com.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Computer8{
	int cid;
	String cBrand;
	public Computer8(int cid, String cBrand) {
		super();
		this.cid = cid;
		this.cBrand = cBrand;
	}
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcBrand() {
		return cBrand;
	}

	public void setcBrand(String cBrand) {
		this.cBrand = cBrand;
	}

	@Override
	public String toString() {
		return "Computer8 [cid=" + cid + ", cBrand=" + cBrand + "]";
	}
	
}
class SortedBrand implements Comparator<Computer8>
{

	@Override
	public int compare(Computer8 o1, Computer8 o2) {
	
		return o2.getcBrand().compareTo(o1.getcBrand());
	}
	}

public class SortedSetExample {

	public static void main(String[] args) {
		//sorted set is child interface of set
		//if we want to represent group of individual objects according to sorting order then we go with sortingset
		//it is an interface we we cant create object.
		
		//able to tell first and last elements in set
		
		//1. comparable  
		//2. comparator
		
		//duplicate is not allowed
		
		SortedSet<String> s = new TreeSet<>();
		s.add("IN");
		s.add("DH");
		s.add("US");
		s.add("AUS");
		System.out.println(s);
		s.remove("US");
		System.out.println(s);
		System.out.println(s.first()+" "+s.last());
		System.out.println(s.headSet("DH"));//BEFORE VALUE
		System.out.println(s.tailSet("DH")); // after value
		System.out.println(s.subSet("AUS", "IN"));
		
		
		SortedSet<Computer8> c4 = new TreeSet<Computer8>(new SortedBrand());
		c4.add(new Computer8(1,"DELL"));
		c4.add(new Computer8(2,"HP"));
		c4.add(new Computer8(3,"MICROSOFT"));
		c4.add(new Computer8(4,"MAC"));
		
		System.out.println(c4);
		
	}

}
