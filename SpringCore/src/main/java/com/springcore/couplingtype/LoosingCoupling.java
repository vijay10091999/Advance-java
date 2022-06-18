package com.springcore.couplingtype;


interface topics {
	
	public void understand();
}

class Topic1 implements topics{ //access of topics method in Topic1 use implements

	public void understand() {
		System.out.println("Understanding topic 1");
	}
}

class Topic2 implements topics{ //access of topics method in Topic2 use implements

	public void understand() {
		System.out.println("Understanding topic 2");
	}
}

class Subject1 extends Topic1{

	@Override
	public void understand() {
		super.understand(); //super used access of parent method 
	}
}


class Subject2 extends Topic2{

	@Override
	public void understand() {
		super.understand(); //super used access of parent method 
	}
}


//1. subject class is not depend on topic because subject class can be run topic1 and topic2 implementation at run time

//2. topic class can be inject in subject class easily base on requirement

//3. topic 1 and topic 2 is loosly couple because they don't have any dependency

//4. loose coupling helps us follow program to interfaces, not implementations.

//5. it’s much easier to swap other pieces of code/modules/objects/components in loose coupling.

public class LoosingCoupling {

	public static void main(String[] args) {

		topics t = new Subject1();
		topics t1 = new Subject2();
		t.understand();
		t1.understand();
	}

}
