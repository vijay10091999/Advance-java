package com.array;

public class InseartingArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[6];
		//EndprintArray(a);
		//StartprintArray(a);
		UpdateValueAtAnyIndex(a);
		for (int i = 0; i < a.length; i++) {
		    System.out.println("Index " + i + " contains " + a[i]);
		}
}


private static void UpdateValueAtAnyIndex(int[] a) {

	// Say we want to insert the element at index 2.
	// First, we will have to create space for the new element.
	StartprintArray(a);
	for (int i = 4; i >= 2; i--)
	{
	    // Shift each element one position to the right.
	    a[i + 1] = a[i];
	}

	// Now that we have created space for the new element,
	// we can insert it at the required index.
	a[2] = 30;
	}


//	Inserting at the Start or beginning of an Array
private static void StartprintArray(int[] a) {
	            EndprintArray(a);
				for (int i = 3; i >= 0; i--) {
				    a[i + 1] = a[i];
				}
			a[0] = 20;
		
	}

//	Inserting at the End of an Array
	private static void EndprintArray(int[] a) {
		// TODO Auto-generated method stub
		int l =0;
		// Add 3 elements to the Array
		for (int i = 0; i < 3; i++) {
		    a[l] = i;
		    l++;
		}
		a[l] = 10;
		l++;
		

	}
}
