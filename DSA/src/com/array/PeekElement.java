package com.array;

	import java.util.*;
public class PeekElement {


	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
				System.out.println("enter the element :");
				int n=sc.nextInt();
				System.out.println("enter array :");
				int[] a=new int[n];
				for(int i=0;i<n;i++){
					a[i]=sc.nextInt();
				}			    
				int A= peakElement(a,n);
				System.out.println(A);
				
				
			
		}

		public static int peakElement(int[] arr,int n)
	    {
		    
		       int j=0;
		       int k=0;
		       int res = 0;
		        for(int i=1;i<arr.length;i++)
		        { // strat with i=1 
		          
		            if(i<arr.length-1)
		            {
		                k=i+1; // incremenet one index in array
		                j=i-1; // decremenet one index in array
		                
		                if(arr[k]<arr[i] && arr[i]>arr[j])
		                {
		                 
		                    res=i;
		                    
		                    return res;
		                }
		            }
		            
		            else
		            {
		                j=i-1;  // decremenet one index in array
		                
		                if(arr[i]>arr[j])
		                {
		                
		                    res=i;
		                    
		                    return res;
		                }
		            }
		        }
		        
		        return res; // if i=0 we found peak value it is return here coz res=0 intially 
		        
		    }
		}
	

