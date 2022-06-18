package com.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Computer11 {
	
	int cid;
	String cbrand;
	int cprice;
	
	public Computer11(int cid, String cbrand, int cprice) {
		this.cid = cid;
		this.cbrand = cbrand;
		this.cprice = cprice;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCbrand() {
		return cbrand;
	}

	public void setCbrand(String cbrand) {
		this.cbrand = cbrand;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
}

class SortedPriceAndName2 implements Comparator<Computer10>{

	@Override
	public int compare(Computer10 o1, Computer10 o2) {
		int PriceCompare =o1.getCprice()-o2.getCprice();
	    int BrandCompare =  o1.getcBrand().compareTo(o2.getcBrand());
	    return (PriceCompare == 0) ? PriceCompare: BrandCompare;  
	}
	
}

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap s = new TreeMap();
		s.put(1,"Ajay");
        s.put(3,2);
        s.put(3,1.1f);
        s.put(4, 's');
        s.put(5, null);
        System.out.println("Elements : "  + s);
        
        System.out.println("set contain 8 ele : " + s.containsKey(8));
        
        s.remove(4);
        System.out.println("remove 8 ele : " + s);
        
        System.out.println("size of set : " + s.size());
        
        s.clear();
        System.out.println("clear set : " + s);
        
        System.out.println("set empty or not :" + s.isEmpty());
        
        TreeMap<Computer10, Integer> j = new TreeMap<Computer10, Integer>(new SortedPriceAndName2());
        
        Computer10 hp =  new Computer10(2,"Hp", 30000);
        Computer10 dell =  new Computer10(1,"Dell", 40000);
        Computer10 acer =  new Computer10(3,"zcer",100000);
        
        j.put(hp,hp.getCprice());
        j.put(dell,dell.getCprice());
        j.put(acer,acer.getCprice());
        
        for (Map.Entry<Computer10, Integer> e : j.entrySet()) {
            System.out.println(e.getKey().getcBrand() + " : " + e.getValue());
        }
	}

}
