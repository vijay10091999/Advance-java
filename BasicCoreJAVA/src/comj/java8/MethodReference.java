package comj.java8;

import java.util.function.BiFunction;

class calservice{
	public static int add(int a , int b) {
		return a+b;
		
	}
	
	public int sub(int a , int b) {
		return a-b;
		
	}
}
public class MethodReference {

	public static void main(String[] args) {
   //method refernce  is used to create simple lamda exp by referncing exisiisng method.
   	BiFunction<Integer,Integer,Integer> adder =(a,b)->{return a+b;};
   	System.out.println(adder.apply(2, 3));
   	
   	//Static method reference -
   	BiFunction<Integer,Integer,Integer> s1 =  calservice::add;
    System.out.println(s1.apply(2, 3));
    
    //instace method
    calservice cs = new calservice ();
   	BiFunction<Integer,Integer,Integer> s2 =  cs::sub;
    System.out.println(s2.apply(3, 3));


   	
   	//how to use method referencing
   	//1. static method 2.constructor 3. instance
   	
	}

}
