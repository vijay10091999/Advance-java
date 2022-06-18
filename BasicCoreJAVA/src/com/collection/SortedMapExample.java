package com.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortedMapExample {
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
	
	
	public static void main(String[] args) {
		SortedMap<Integer,String> ts = new TreeMap<Integer,String>();
		 ts.put(2,"India");
	     ts.put(3,"Australia");
	     ts.put(1,"China");
	     ts.put(4,"Usa");
	     ts.put(5,"South Africa");
	     System.out.println("Elements : " + ts);
	     
	  // add duplicate value
	     ts.put(1, "China");
	     
	     System.out.println("Access ele : " + ts);
	     
	     ts.remove(3);
	     System.out.println("Remove ele : " + ts);
	     
	     Set d  =ts.entrySet();
	     Iterator it = d.iterator();
	        while (it.hasNext())
	        {
	        	@SuppressWarnings("unchecked")
				Map.Entry<Integer,String> v = (Entry<Integer,String>) it.next();
	        	System.out.println("Key : " + v.getKey() + " "  + "Value  :"  + v.getValue());
	        }
	        
	     System.out.println("Contains " + "India : " + " " + ts.containsValue("India")); 
	     
	     System.out.println("First Value : " + ts.firstKey());
	     
	     System.out.println("Last Value  : " + ts.lastKey());
	    
	     System.out.println("Head Set : " + ts.headMap(5));
	     
	     System.out.println("tail Set : " + ts.tailMap(5));
	     
	     System.out.println("Sub set : " + ts.subMap(3, 5));
	     
	     

	}

}
