package com.array;

public class SubArraywithSum {
	
	
	

	  public static void main( String[] args )  
	    {   
	 int [] array = {1,2,3,7,5}; 
	 int sum;  
	 subarray( array , 5 , 12 ) ;  
	    }
		    static int subarray(int arr[] , int n , int sum )  
		    {  
		        int currentsum, i , j ;  
		        // start array with the initial index try all subarrays starting with  ' i '  
		  
		        for ( i = 0 ; i < n ; i++ ) {   // start with i=0;
		            currentsum = arr[ i ] ;   // put currentsum equal to arr[i] coz we found extach match of sum
		       
		            //take another loop for go to next index from i=0
		            for (j = i + 1 ; j <= n ; j++) {   //j=1 when i=0
		                if (currentsum == sum) {  // if sum and currentsum equal 
		                    int p = j - 1 ;   // p=0 when j=1 // go to previous index 
		                    System.out.println(  
		                        " Sum found between indexes  " + i  
		                        + " and " + p) ;  
		                    return 1 ;  
		                }  
		                
		                //it is use when sum is not excat equal to currentsum so sum is in betwwen the number then find range
		                if (currentsum > sum || j == n)  
		                    break ;  
		                currentsum = currentsum + arr[j] ;  
		            }  
		        }  
		  
		        System.out.println(" No subarray found " ) ;  
		        return 0 ;  
		    }  
		    
		} 
