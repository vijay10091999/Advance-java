package com.linear.search.array;

public class FindNoExistOrNot {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int n = 6;
		int x= 67;
		int a[] = new int [n];
		int arr[] = {11,34,56,78,54,89,67};
	   // existno(arr,x);
	    int ans = linearsearch(arr,x);
	    System.out.println("The value which present at index is "+ans);
	}

	private static void existno(int[] arr, int x) {
		// TODO Auto-generated method stub
		Boolean f = false;
		for(Integer i : arr) {
			if(i==x) {
				f=true;
				break;
			}
		}
		System.out.println(x+" Number present in array is : "+f);
	}
	
	
	
	static int linearsearch(int[] a, int x) {
	
		//search array : return index if item found
		// returjn -1 if itam not found
			if(a.length==0) {
				return -1;
			}

			//searching elemnt at every index if it is == x
			for(int i=0;i<a.length;i++) {
				//int e=a[i];
				if(a[i]==x) {
					return i;
				}
			}
		
		return -1;
		
	}

}
