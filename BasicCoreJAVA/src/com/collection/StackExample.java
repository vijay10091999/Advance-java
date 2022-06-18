package com.collection;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
//stack is linear data structure that is used to stored collection of object
	//stack is based on LIFO (LAST IN FIRST OUT)
	//three operations - 1.push 2.pop 3.peek
	
	//Example undo opearation
	//2.reverse of string
	
	//deafault size of stack is 10
	public static void main(String[] args) {
		System.out.println("Enter your student count");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Stack<Integer> id = new Stack<>();
		for(int i=0;i<num;i++) {
			int value = sc.nextInt();
			id.push(value);
		}
		System.out.println(id);
		int p = id.pop();
		System.out.println(p);
		
		int q = id.peek();
		System.out.println(q);
		
	}

}
