package com.basicjava;

public class Operators {

	public static void main(String[] args) {

		//Unary Operators - it only needs one operand(variable name) to perform any operation 
		int a = 20;
		System.out.println(a++); // a++ -> its post increment -> first assign value then increment
		System.out.println(a);
		
		System.out.println(++a); // ++a -> its pre increment -> first increment value then assign value
		System.out.println(a);
		
		System.out.println(a--); // a-- -> its post decrement -> first assign value then decrement
		System.out.println(a);
		
		System.out.println(--a); // a-- -> its pre decrement -> first decrement value then assign value
		System.out.println(a);
		
		// Arithmetics - its used to perform Add, Sub , Mul , Div
		int x = 10;
		int y = 20;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); //% - modulo - used to find out remainder
		
		//Shift Operator -> left and right 
		int b = 10;
		int d = 2;
		System.out.println(b>>d); // right shifting -> b / (2^d) -> 10/(2^2) -> 2
		System.out.println(b<<d); // left shifting -> b * (2^d) -> 10*(2^2) -> 40
		
		//Relational operator -> it gives output in boolean format
		int g = 20;
		int t = 34;
		System.out.println(g<t);
		System.out.println(g>t);
		System.out.println(g<=t);
		System.out.println(g>=t);
		System.out.println(g==t);
		System.out.println(g!=t);
		
		//Logical Operator -> && , ||  -> it gives output in boolean value
		System.out.println((g<t)&&(g>t));
		System.out.println((g<t)||(g>t));
		
		//Bitwise Operator -> & ,|,^
		int p = 10;
		int q = 20;
		System.out.println(p&q);
		System.out.println(p|q);
		System.out.println(p^q);
		
		//ternary operator -> its used as conditional operator
		int result = (p>q)?p:q; 
	// to test number even and odd 
		String result1 = (p%2==0)?"Even Number":"Odd Number";
		System.out.println(result1);
		System.out.println(result);
		
		//Assignment Operator -> assign value to variable
		p += q; // p = p+q = 30
		p -= q; // p = p-q = 10
		p *= q; // p = p*q = 200
		p /= q; // p = p/q = 10
		System.out.println(p);
	}

}
