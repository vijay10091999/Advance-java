package comj.java8;

public class Employee {

	int eid;
	int esalary;
	String ename;
	
	public Employee(int eid, int esalary, String ename) {
		super();
		this.eid = eid;
		this.esalary = esalary;
		this.ename = ename;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", esalary=" + esalary + ", ename=" + ename + "]";
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
