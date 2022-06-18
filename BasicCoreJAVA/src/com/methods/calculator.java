package com.methods;

public class calculator {
public static void main(String[] args) {

	int result =add(2,3);
	System.out.println(result);
}

private static int add(int i, int j) {

	if(i>j) {
		return i;
	}else {
		return j;
	}
}
}
