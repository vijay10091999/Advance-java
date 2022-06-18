package comj.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePredefineFunction {

	public static void main(String[] args) {
		// predefine function follows functions interface concept
		//1.predicate  2.function 3.consumer 4.supplier
		
		//predicate - it takes some input and perform some conditional check and return boolean value.
		//eg : to check number is even or odd
		
		int n = 4;
		if(n%2==0) {
			System.out.println("Even no");
		}else {
			System.out.println("odd no");
		}
		
		
		Predicate<Integer> t = c->c%2==0;
		//System.out.println("check Even or odd no : "+t.test(3));
		
		//use negate method : return logical negation of existing predicate
	  	//System.out.println("check Even or odd no : "+t.negate().test(34));
	  	
	  	Predicate<Integer> s = q-> q>3;
	  	//System.out.println("Check no is greater than 90 :"+s.test(90));
	  	
	         
	  	 ArrayList<Integer> a = new ArrayList<Integer>();
	     for(int i=0;i<5;i++) {
	  	   a.add(i);
	     }
	     for(Integer w : a) {
	    	 //check both condition
	    	 if(t.and(s).test(w)) 
	    		System.out.println("check even or odd no : " + w); 
	     
	    	 if(t.or(s).test(w)) 
		    		System.out.println("check even or odd no : " + w); 
		     
	  
	     }
	     
	     //to test string length greater than 5
	     //pass predicate in fuction 
	     List<String> s1 = Arrays.asList("Vijay","Ajay","kajal","rohn","darpna","snajay");
	     
	     for(String w : s1) {
	    	 Predicate<String> len = g-> w.length()>5;
	    	 checklength(len,w);
	    	 
		     
	  
	     }
	     
	     
	  	}

	private static void checklength(Predicate<String> len, String w) {
		// TODO Auto-generated method stub
		System.out.println(w+":"+len.test(w));

	}

	
	  	
	  	
	  	
		
}
