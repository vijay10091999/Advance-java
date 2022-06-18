package com.collection;


import java.util.TreeSet;
class Computer7{
	int cid;
	String cBrand;
	public Computer7(int cid, String cBrand) {
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
		return "Computer7 [cid=" + cid + ", cBrand=" + cBrand + "]";
	}
	
}
public class TreeSetExample {

	public static void main(String[] args) {
		//it is self balncing tree
		//it uis not hectrogenous we cant store values
		//result a;wdys in ascending order
		//insertion is not preserve
		//it has unique element present 
		TreeSet <Integer> t= new TreeSet<>();
		t.add(10);
		t.add(25);
		t.add(40);
		t.add(56);
		System.out.println(t);
		System.out.println(t.contains(25));
		t.remove(40);
		System.out.println(t);
		System.out.println(t.size());
		
		
		TreeSet<Computer7> c4 = new TreeSet<>();
		c4.add(new Computer7(1,"DELL"));
		c4.add(new Computer7(2,"HP"));
		c4.add(new Computer7(3,"MICROSOFT"));
		c4.add(new Computer7(4,"MAC"));
		
		System.out.println(c4);
	}

}
