package com.collection;

import java.util.Vector;

class Computer1{
	int cid ;
	String cbrand ;
	public Computer1(int cid, String cbrand) {
		super();
		this.cid = cid;
		this.cbrand = cbrand;
	}
	@Override
	public String toString() {
		return "Computer1 [cid=" + cid + ", cbrand=" + cbrand + "]";
	}
	
	
}

public class VectorExample {

	
	//vector and Vector is same but only one diffrenece that every method 
	//present in vector is synchroniza
	//it is thread safe
	public static void main(String[] args) {

		Vector s = new Vector();
		s.add(10);
		s.add(20);
		s.add("vijay");
		//System.out.println("Array of second place :"+s.get(2));
		
		
		//use for loop 
		for(int i=0;i<s.size();i++) {
			//System.out.println("Array size :"+s.get(i));
		}
		
		//use generic Vector
		Vector<String> s1 = new Vector<String>();
		s1.add("sonali");
		s1.add("Kajal");
		//System.out.println(s1);
		for(String sname : s1) {
			//System.out.println(s1);
		}
		
		
		//chnage elemnet
		s1.add(0, "darpna");
		//System.out.println(s1);
		
		//replace elemet from index
		s1.set(0,"Chetan");
		//System.out.println(s1);
		
		//remove the element
		s1.remove(0);
		//System.out.println(s1);
		
		//retainAll
		Vector<String> s3 = new Vector<String>();
		s3.add("sonali");
		s3.add("golana");
		s1.retainAll(s3);
		//System.out.println(s1);
		
		//clearAll
		s3.clear();
		//System.out.println(s3);
		
		Vector<Computer1> com = new Vector<Computer1>();
		com.add(new Computer1(0,"DELL"));
		com.add(new Computer1(1,"HP"));
		com.add(new Computer1(2,"MAC"));
		System.out.println(com);
	}

}
