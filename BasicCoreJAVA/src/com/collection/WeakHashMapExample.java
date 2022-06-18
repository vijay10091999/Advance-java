package com.collection;

import java.util.HashMap;
import java.util.WeakHashMap;
class Temp{

	@Override
	public String toString() {
		return "Temp";
	}
	
	// we have finlaize method for clean up code 
	// like clean all connection to weak object
	
	public void finalize() {
		System.out.println("It is used to clean up code..");
	}
}

public class WeakHashMapExample {

	public static void main(String[] args) {
		// need of weak hash map
		
				HashMap<Temp,String> h = new HashMap<Temp, String>();
				Temp t = new Temp();
				h.put(t,"Ajay");
				System.out.println("Temp contain : "  + h);
				
				t = null;
				
				// garbage colector go to temp object and ask you haven't have reference so i will kill you
				System.gc();
				
				System.out.println("GC try to kill temp object : " + h);
				// but gc is failed to do because it is refrence with hashmap internally so gc not have permission to kill
				
				WeakHashMap<Temp,String> h1 = new WeakHashMap<Temp, String>();
				Temp t1 = new Temp();
				h1.put(t1,"Ajay");
				System.out.println("Temp contain : "  + h1);
				t1 = null;
				System.gc();
				System.out.println("GC try to kill temp object : " + h1);
				
				
	}

}
