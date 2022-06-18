package com.linear.search.array;

import java.util.Arrays;

public class CountIntegerEvenWithDigitSum {
	

	public static void main(String[] args) {
		
int num= 4;
int ans = countEven(num);
System.out.println(ans);
	}

	public static int countEven(int n) {
		int sum = 0;
        int digitSum, digit;
        for (int i = 2; i <= n; i++) {
            digitSum = 0;
            digit = i;
            while (digit > 0) {
                digitSum += (digit % 10);
                digit = digit / 10;
            }
            if (digitSum % 2 == 0) sum++;   
        }
        return sum;
    }

}
