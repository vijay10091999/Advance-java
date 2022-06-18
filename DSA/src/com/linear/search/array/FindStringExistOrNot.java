package com.linear.search.array;

public class FindStringExistOrNot {

	public static void main(String[] args) {
		String target = "vijay";
		char target1 = 'j';
		String arr[] = {"raje","tejal","kajal","ajay","monali","vijay","sonali"};
	   // existno(arr,x);
	    //int ans = linearsearch(arr,target);
	    //System.out.println("The value which present at index is "+ans);
	    
	    Boolean ans1=Searchchar(target,target1);
	    System.out.println("Yes, the value of " +target1+" is present , i.e "+ans1);
	}

	private static boolean Searchchar(String str, char target1) {
		if (str.length() == 0) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {  //for(char ch : str.tocharArray())
			if (target1 == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	private static int linearsearch(String[] arr, String x) {

		if(arr.length==0) {
			return -1;
		}

		//searching elemnt at every index if it is == x
		for(int i=0;i<arr.length;i++) {
			//int e=a[i];
			if(arr[i]==x) {
				return i;
			}
		}
	
	return -1;
	}

}
