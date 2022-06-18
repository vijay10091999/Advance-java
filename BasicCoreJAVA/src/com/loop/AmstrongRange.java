package com.loop;

public class AmstrongRange {

	public static void main(String[] args) {
	int	n1 = 153 , n2 = 20000 ,i;
	double result = 0;
	for(i = n1;i<n2;i++) {
		for(i = n1;i!=0;i/=10) {
		int r = i%10;
		result = result + Math.pow(r, 4); 
		}
	}
	if(result ==i)
	System.out.println("Amstrong number is :"+i);
	}

}
