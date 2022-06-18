package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Computer9{
	int cid;
	String cBrand;
	int cprice;
	public Computer9(int cid, String cBrand, int cprice) {
		super();
		this.cid = cid;
		this.cBrand = cBrand;
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "Computer9 [cid=" + cid + ", cBrand=" + cBrand + ", cprice=" + cprice + "]";
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

public class HashMapExample {
public static void main(String[] args) {
	//Map is basicalley based on key value pair
	//key is not allowed to duplicated but value can be duplicate 
	//each key value pair called as entry
	//types of MAP : 
	//1.HashMap
	//2.LinkedHashMap
	//3.IdentityHashMap
	//4.WeakHashMap
	//5.SortedMap
	//6.NavigableMap
	//7.TreeMap
	//hashMap is based on hash table and it is used when want to do search operattion.
	
	
	HashMap<String, Integer> m = new HashMap<String, Integer>();
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
	HashMap<Computer9, Integer> j = new HashMap<Computer9, Integer>();
	 Computer9 hp =  new Computer9(1,"Hp", 100000);
     Computer9 dell =  new Computer9(2,"Dell", 40000);
     Computer9 acer =  new Computer9(3,"Acer",600000);
     
     j.put(hp,hp.getCprice());
     j.put(dell,dell.getCprice());
     j.put(acer,acer.getCprice());
     
     for (Entry<Computer9, Integer> e : j.entrySet()) {
         System.out.println(e.getKey().getCid()+" :"+e.getKey().getcBrand() + " : " + e.getValue());
     }
}
}
