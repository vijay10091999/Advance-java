package com.string;


class ExampleMethods{
	public void Stringmethod() {
		MethodcharAt(); // its return character value of given index
		Methodconcat(); //it combines specified strings at end of strings
		Methodcontains(); // it search sequenced of charcater in string.
		methodIndexof(); // it return position of first occureeced of specified chracater 
		MethodReplace(); // it returns String replacing all old charcter to new charcater.
		MethodSubString(); // it returns part of strings
		Methodtrim(); //it eliminate leading and trailing spaces.
		LowerandUpper();
		Split();
		MethdiCompareto(); // it compared given string with current string and return +ve -ve and zero value
	}

	private void Split() {
		String s1 ="chetan,is-good/boy"; //chetan - 0 index , is-good/boy - 1 index
		String[] s2 =s1.split(",");
	//	System.out.println(s2[0]);
		for(int i=0;i<s2.length;i++) {
			//System.out.println(s2[i]);
		}
	}

	private void MethdiCompareto() {
		//if s1 after s2 ->  +ve number
		//if s1 Before s2 ->  -ve number
		//if s1 equal s2 ->   0 number
		//captial letter - first priority and small letter - second priority
		String s1 ="Hello";
		String s2 ="hello";
		String s3 = "H";
		String s4 = "ABC";
		//Hello , hello 
//	System.out.println(s1.compareTo(s2));
//    System.out.println(s2.compareTo(s1));
//   System.out.println(s3.compareTo(s4));
		
		String s5 = "ABC";
		//System.out.println(s4.compareTo(s5));
	}

	private void LowerandUpper() {
		String name= "Ajay";
//System.out.println(name.toLowerCase());
//System.out.println(name.toUpperCase());
	}

	private void Methodtrim() {
		String name= "    chetan    "; //counting spaces 
		//System.out.println(name.length() + name); // output - 14
		 name = name.trim();
		//System.out.println(name.length() + name); // output - 10
	}

	private void MethodSubString() {
		String name= "Sheetal";              
//System.out.println(name.substring(4));
//System.out.println(name.substring(2, 4)); //index strt from 0 to n-1
	}

	private void MethodReplace() {
		String name = "i am vijay i am vijay i am vijay i am vijay i am vijay"; 
//System.out.println(name.replace("vijay", "mayank"));
//	System.out.println(name.replace("jay", "nay"));
	}

	private void methodIndexof() {
		String name = "i am vijay am";    // i am vijay  a m
										 //-10123456789101112
//System.out.println(name.indexOf("am"));
//		System.out.println(name.indexOf("Am"));
	}

	private void Methodcontains() {
		String name = "i am vijay";     		 
System.out.println(name.contains("vi"));
//		System.out.println(name.contains("Am"));
	}

	private void Methodconcat() {
		String name = "vijay"; 
		name = name.concat("Ankit").concat("Hemant");
		name = "chetan".concat("mayank");
		System.out.println(name);
		
		
	}

	private void MethodcharAt() {
		String name = "vijay";            // v i j a y
		 								 //  0 1 2 3 4
		for(int i = 0;i<name.length();i++) { 
			if(i%2!=0) { // for find odd position
				System.out.println(name.charAt(i));
			}
		}
	}
}


public class StringMethods {

	public static void main(String[] args) {
  
		ExampleMethods e = new ExampleMethods();
		e.Stringmethod();
	}

}
