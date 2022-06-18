package com.array;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fun(2,3,4,5,5,6,6);
multiple(10,20,"vijay","ajay","sonali");
	}
static void fun(int ...v) {
	System.out.println(Arrays.toString(v));
}

static void multiple(int a , int b , String...c) {
	System.out.println(Arrays.toString(c));
}
}
