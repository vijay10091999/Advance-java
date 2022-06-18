package comj.java8;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
/*if developer gets evertimes null pointer exception 
  in code we can handle by using optional class */
	
		
	String name = null;
	if(name == null) {
		System.out.println("please correct name ");
	}else {
		System.out.println(name.length());
	}
	
	try {
		int leng = name.length();
		System.out.println(leng);
		
	} catch (Exception e) {
System.out.println(e); 



//optional class
Optional<String> n =  Optional.ofNullable(name);
System.out.println(n.isEmpty());
System.out.println(n.isPresent());
System.out.println(n.orElse("Please provide correct name"));
	name ="Vijay";
	n = Optional.ofNullable(name);
	//System.out.println(n);
	System.out.println(n.orElse("Please provide correct name"));

	
	int f = n.map(y-> y.length()).get();
	System.out.println(f);
	}
		
	}
	
	

}
