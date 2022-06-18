package com.array;

import java.io.*;
import java.util.*;
public class FIndKthSmallestElement {

		public static void main (String[] args) {
		
					Scanner sc=new Scanner(System.in);
					
					System.out.println("enter how much element you want : ");
					    int n=sc.nextInt();
					    
					    int arr[]=new int[n];
					    
						System.out.println("enter element you want : ");
					    for(int i=0;i<n;i++) {
					    arr[i]=sc.nextInt();
					    }
					    
						System.out.println("enter kth value : ");

					    int k=sc.nextInt();
					    int res= kthSmallest(arr, 0, n-1, k);
					    int res1= kthlargest(arr, 0, n-1, k);
					    System.out.println("Minimum value : "+res+" Maximum value : "+res1);

				
			}

			    public static int kthSmallest(int[] arr, int l, int r, int k) 
			    { 
			        //sorting thye array 
			        Arrays.sort(arr);
			       int res = 0; //intaiily res =0
			       
			       
			       while(l<k){ // left =0  k=3 // 0<3
			           if(l==k-1){ // 0==2
			               res = arr[l];
			               break;	               		               
			           }
			           else if(r==k-1){ // 3==2
			               res = arr[r]; 
			               break;
			           }
			           else{
			               l++; //l =1
			               r--;  //r =2
			           }
			       }
			       return res;
			   }
			    
			    public static int kthlargest(int[] arr, int l, int r, int k) 
			    { 
			        
			        Arrays.sort(arr);
			       int res = 0;
			       while(r>k){
			           if(l==k+1){
			               res = arr[l-1];
			               break;	               		               
			           }
			           else if(r==k+1){
			               res = arr[r-1];
			               break;
			           }
			           else{
			               l++;
			               r--;
			           }
			       }
			       return res;
			   } 
			
			 
}

