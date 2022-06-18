package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumberMoveEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the element :");
		int n=sc.nextInt();
		System.out.println("enter array :");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}			    
		NegativeElement(a,n);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void NegativeElement(int[] a, int n) {

		//find count of negative number 
		int c=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				c++;
			}
		}
		
		//define size for minus and pos 
		int[] minus = new int[n];
		int[] pos = new int [n-c];
		
		
		//i index for iterate array  
		// k index for postive value 
		// t index for negative value
		for(int i=0,k=0,t=0;i<n;i++) {
			if(a[i]<0) {
				minus[t++] = a[i];
				
			}else {
				pos[k++] = a[i];
			}
		}
		
		//how to set value on postion first postive value then negative value
		for(int i=0;i<n-c;i++) {
			        a[i]=pos[i];
		}
		for(int i=n-c;i<n;i++) {
	        a[i]=minus[i-n+c];
}
		
	}

}
