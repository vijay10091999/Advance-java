package com.array;

public class DeletingArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		
		EndprintArray(a);
		//StartprintArray(a);
		//UpdateValueAtAnyIndex(a);
	
	}


	private static void UpdateValueAtAnyIndex(int[] a) {
		// Say we want to delete the element at index 1
		int l =0;
		for (int i = 0; i < 6; i++) {
		    a[l] = i;
		    l++;
		}
		l--;
		
		for (int i = 1; i < l; i++) {
		    // Shift each element one position to the left
		    a[i - 1] = a[i];
		}
		for (int i = 2; i < l; i++) {
		    // Shift each element one position to the left
		    a[i - 1] = a[i];
		}

		// Again, the length needs to be consistent with the current
		// state of the array.
		l--;	
		for (int i = 0; i < l; i++) {
		    System.out.println("Index " + i + " contains " + a[i]);
	}
	}


	private static void StartprintArray(int[] a) {
		// TODO Auto-generated method stub
		int l =0;
		// Add 3 elements to the Array
		for (int i = 0; i < 6; i++) {
		    a[l] = i;
		    l++;
		}
		l--;
		// Starting at index 1, we shift each element one position
		// to the left.
		for (int i = 1; i < l; i++) {
		    // Shift each element one position to the left
		    a[i - 1] = a[i];
		}

		// Note that it's important to reduce the length of the array by 1.
		// Otherwise, we'll lose consistency of the size. This length
		// variable is the only thing controlling where new elements might
		// get added.
		//l--;
		for (int i = 0; i < l; i++) {
		    System.out.println("Index " + i + " contains " + a[i]);
	}
}


	private static void EndprintArray(int[] a) {
		// TODO Auto-generated method stub
		int l =0;
		// Add 3 elements to the Array
		for (int i = 0; i < 6; i++) {
		    a[l] = i;
		    l++;
		}
		l--;
		for (int i = 0; i < l; i++) {
		    System.out.println("Index " + i + " contains " + a[i]);
	}
	}
}