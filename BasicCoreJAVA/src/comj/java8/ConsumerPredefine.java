package comj.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerPredefine {

	public static void main(String[] args) {

		//it accept some input and perform the required operation and not required to return anything.
		
		Consumer<String> sname = n-> System.out.println(n);
		sname.accept("Vijay");
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1,1200,"vijay"));
		e.add(new Employee(2,1400,"Ajay"));
		e.add(new Employee(3,1500,"Sanjay"));
		Consumer<Employee> data = e1 ->{
			System.out.println(e1.eid+" "+e1.ename+" "+e1.esalary);
		};

	e.forEach(s->data.accept(s));
	
	
	System.out.println("===================================");
	
	Consumer<Integer> c1 = n -> System.out.println(n+ "*2:"+n*2);
	Consumer<Integer> c2 = m -> System.out.println(m*m*m);

	c1.andThen(c2).accept(2); // it is not returning value
	
	System.out.println("===================================");

	c2.andThen(c1).accept(2);
	
	BiConsumer<Employee, Integer> sal = (q,r) -> q.esalary = q.esalary+r;
	e.forEach(s->sal.accept(s,1000));
    System.out.println(e);
	}

}
