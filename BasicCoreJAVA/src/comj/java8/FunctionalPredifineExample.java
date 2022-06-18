package comj.java8;

import java.util.function.Function;

public class FunctionalPredifineExample {

	public static void main(String[] args) {

	//it take some input and perform some operation and return the result need not to be boolean.
		
		Function<Integer, Integer> i = n -> n *n ;
		System.out.println("Sqaure of number : "+i.apply(3));
		
		//get length of Stirng
		Function<String, Integer> i1 = n -> n.length() ;
		System.out.println("get length of string : "+i1.apply("vijay"));
		
		Function<Integer, Integer> K = l -> l *2 ;
		Function<Integer, Integer> s = b -> b *b*b ;

		
		//use andThen()
		System.out.println(K.andThen(s).apply(1));
		System.out.println(s.andThen(K).apply(1));
		
		//compose() -> calculate inside bracket value
		System.out.println(K.compose(s).apply(1));
		System.out.println(s.compose(K).apply(1));
	}

}
