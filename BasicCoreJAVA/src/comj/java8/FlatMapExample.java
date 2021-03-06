package comj.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
         //Map method is used for transformation. 
		//FlatMap method is used for transformation and flattering 
//it is used to convert stram of stream into single stream.
		
		List<String> p1 = Arrays.asList("a","b","c","d");
		List<String> p2 = Arrays.asList("e","f","g","h");
		List<String> p3 = Arrays.asList("i","j","k","l");
		List<String> p4 = Arrays.asList("m","n","o","l");
		
		ArrayList<List<String>> a = new ArrayList<List<String>>();
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		System.out.println(a);
		ArrayList<String> a1 = new ArrayList<String>();
		for(List<String> x : a) {
			for(String y :x) {
				a1.add(y);
			}
		}
System.out.println(a1);
	

//FlatMap

List<String> z = a.stream().flatMap(q -> q.stream()).collect(Collectors.toList());
	System.out.println(z);
	}

}
