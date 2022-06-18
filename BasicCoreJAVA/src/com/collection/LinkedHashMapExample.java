package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


class Computer10{
	int cid;
	String cBrand;
	int cprice;
	public Computer10(int cid, String cBrand, int cprice) {
		super();
		this.cid = cid;
		this.cBrand = cBrand;
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "Computer10 [cid=" + cid + ", cBrand=" + cBrand + ", cprice=" + cprice + "]";
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
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	
	
	
}


public class LinkedHashMapExample {
	//insertion order is preserve

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String, Integer>();
		m.put("ajay", 10);
	    m.put("vijay", 20);
	    m.put("sonali", 30);
	    
	    System.out.println("Access data : " + m);

		for(Entry<String, Integer> i : m.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		for(String e : m.keySet()) {
			System.out.println(e);
		}
		for(Integer e : m.values() ) {
			System.out.println(e);
		}
		HashMap<Computer10, Integer> j = new HashMap<Computer10, Integer>();
		 Computer10 hp =  new Computer10(1,"Hp", 100000);
	     Computer10 dell =  new Computer10(2,"Dell", 40000);
	     Computer10 acer =  new Computer10(3,"Acer",600000);
	     
	     j.put(hp,hp.getCprice());
	     j.put(dell,dell.getCprice());
	     j.put(acer,acer.getCprice());
	     
	     for (Entry<Computer10, Integer> e : j.entrySet()) {
	         System.out.println(e.getKey().getCid()+" :"+e.getKey().getcBrand() + " : " + e.getValue());
	     }
	}

}
