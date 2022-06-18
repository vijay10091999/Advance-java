package comj.java8;

import java.util.function.Supplier;

public class SupplierPredefine {

	public static void main(String[] args) {
//supplier : it dont take an input only supply object.
		//to genretate OTP
		
		Supplier<String> s = ()-> {
			String otp ="";
			for(int i=0; i<6;i++) {
				otp = otp+ (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
	
	
	}

}
