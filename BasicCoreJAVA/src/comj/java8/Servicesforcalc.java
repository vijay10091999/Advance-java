package comj.java8;

@FunctionalInterface // used to make sure that it is functonal interface
//only one service present in intercae 
public interface Servicesforcalc {

	public int add(int a,int b);
	static int sub(int x, int y) {
		return x-y;
	}
	}
