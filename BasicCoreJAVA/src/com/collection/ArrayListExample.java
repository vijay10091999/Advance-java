package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

class Computer{
	int cid ;
	String cbrand ;
	public Computer(int cid, String cbrand) {
		super();
		this.cid = cid;
		this.cbrand = cbrand;
	}
	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", cbrand=" + cbrand + "]";
	}
	
	
}


public class ArrayListExample {

	public static void main(String[] args) {
   //ArrayList is overcome problem of Array object.
//where to use when we want ro reterve th data from large dataset -randoem access
		//worst choice if we domne addtion remove and updataion 
		//new cpacity = (current capacity * 3/2)+1
		//1.for hetergenous data 
		
		ArrayList s = new ArrayList();
		s.add(10);
		s.add(20);
		s.add("vijay");
		//System.out.println("Array of second place :"+s.get(2));
		
		
		//use for loop 
		for(int i=0;i<s.size();i++) {
			//System.out.println("Array size :"+s.get(i));
		}
		
		//use generic ArrayList
		ArrayList<String> s1 = new ArrayList<String>();
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
		ArrayList<String> s3 = new ArrayList<String>();
		s3.add("sonali");
		s3.add("golana");
		s1.retainAll(s3);
		//System.out.println(s1);
		
		//clearAll
		s3.clear();
		//System.out.println(s3);
		
		ArrayList<Computer> com = new ArrayList<Computer>();
		com.add(new Computer(0,"DELL"));
		com.add(new Computer(1,"HP"));
		com.add(new Computer(2,"MAC"));
		System.out.println(com);
		
	}

}
