package com.collection;


import java.util.ArrayList;
import java.util.LinkedList;


class Computer2{
	int cid ;
	String cbrand ;
	public Computer2(int cid, String cbrand) {
		super();
		this.cid = cid;
		this.cbrand = cbrand;
	}
	@Override
	public String toString() {
		return "Computer2 [cid=" + cid + ", cbrand=" + cbrand + "]";
	}
	
	
}

public class LinkedListExample {
//to overcome the problem of the  array list we need to use array list
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for hectro genuos 
		
		LinkedList s = new LinkedList();
		s.add(10);
		s.add(20);
		s.add("vijay");
		System.out.println("Array of second place :"+s.get(2));
		
		
		//use for loop 
		for(int i=0;i<s.size();i++) {
			System.out.println("Array size :"+s.get(i));
		}
		
		
		//use generic LinkedList
				LinkedList<String> s1 = new LinkedList<String>();
				s1.add("sonali");
				s1.add("Kajal");
				System.out.println(s1);
				for(String sname : s1) {
					System.out.println(s1);
				}
				
				
				//chnage elemnet
				s1.add(0, "darpna");
				System.out.println(s1);
				
				//replace elemet from index
				s1.set(0,"Chetan");
				System.out.println(s1);
				
				//remove the element
				s1.remove(0);
				System.out.println(s1);
				
				//retainAll
				LinkedList<String> s3 = new LinkedList<String>();
				s3.add("sonali");
				s3.add("golana");
				s1.retainAll(s3);
				System.out.println(s1);
				
				//clearAll
				s3.clear();
				System.out.println(s3);
				
		
				LinkedList<Computer> com = new LinkedList<Computer>();
				com.add(new Computer(0,"DELL"));
				com.add(new Computer(1,"HP"));
				com.add(new Computer(2,""
						+ "MAC"));
				System.out.println(com);
				
				
	}

}
