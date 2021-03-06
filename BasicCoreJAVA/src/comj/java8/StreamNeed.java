package comj.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamNeed {

	public static void main(String[] args) {
    // streams related to collection framework and group 0f object
	//streams api is basically perform bulk operation and process the object of collection.
		
		//without stream
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(10);
a.add(60);
a.add(30);
a.add(82);
a.add(47);
System.out.println(a);

ArrayList<Integer> a1 = new ArrayList<Integer>();
for(Integer i : a) {
	if(i%2==0)a1.add(i);
}
//System.out.println(a1);

ArrayList<Integer> a3 = new ArrayList<Integer>();
for(Integer i : a) {
	i= i*2;
	a3.add(i);
}
//System.out.println(a3);

ArrayList<Integer> a4 = new ArrayList<Integer>();
int count = 0;
for(Integer i : a) {
	if(i%2!=0)
		count++;
	a4.add(i);
}
//System.out.println("counting of Even no : "+count);

//with stream:

List<Integer> z = a.stream().filter(i->i%2==0).collect(Collectors.toList());
//System.out.println(z);
List<Integer> z1 = a.stream().map(j->j*2).collect(Collectors.toList());
//System.out.println(z1);
long z2 = a.stream().filter(j->j%2!=0).count();
//System.out.println("counting of Even no : "+z2);


//sorting :

Collections.sort(a); //incresing order
//System.out.println("without stream inc : "+a);

Comparator<Integer> cp = (b1,b2) -> {
	return b2.compareTo(b1);
};
Collections.sort(a,cp);
//System.out.println("without stream dec :"+a);
//using stream : 
List<Integer> inc =  a.stream().sorted().collect(Collectors.toList());
//System.out.println("with stream inc :"+inc);

List<Integer> dec =  a.stream().sorted((m1,m2)->(m2.compareTo(m1))).collect(Collectors.toList());
//System.out.println("with stream dec :"+dec);

//maximum
Integer max =  a.stream().max((m1,m2)->(m1.compareTo(m2))).get();
System.out.println("with stream find maximum number from list :"+max);

//minimum
Integer min =  a.stream().min((m1,m2)->(m1.compareTo(m2))).get();
System.out.println("with stream find minnimum number from list :"+min);



}
}


