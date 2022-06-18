package comj.java8;

import java.util.ArrayList;

public class LambdaExpressions implements Servicesforcalc {

	public static void main(String[] args) {
   /*lambda is annonymous function-no name , no modifier , no return type
	 need -> 1. reduce line of code
		       2.to call APIs very effectivelyt
		       3.to write more maintable and readable and concise code
		       4. it is ony work if interface is functional interface 
		       5. functional interfae - if interface contain only one abstract method
		       6.eg : collection comparable interface we have compare method.
		        */
	
	
  //method 1 :
   // System.out.println(sqaure(9));
    
    
    //method 2:
    System.out.println("add by interface "+new LambdaExpressions().add(5, 6));
   
	
//method 3:
	Servicesforcalc s = new Servicesforcalc() {
		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}	
	};
    System.out.println("add by anayaomnous "+s.add(5, 5));

    
    //method 4:Lambda expression
    
 
    //Servicesforcalc s1 = (a,b)-> (a+b);
    Servicesforcalc s1 = (a,b)-> {return(a+b);};
    System.out.println("Add more method : "+Servicesforcalc.sub(4, 3));


    System.out.println("add by Labda exp "+s.add(5, 5));

    ArrayList<Integer> a = new ArrayList<Integer>();
   for(int i=0;i<5;i++) {
	   a.add(i);
   }System.out.println(a);
   
   a.forEach((d)-> System.out.println(sqaure(d)));
   
	}

	
	private static int sqaure(int i) {
    return (i*i);		
	}


	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	



}
