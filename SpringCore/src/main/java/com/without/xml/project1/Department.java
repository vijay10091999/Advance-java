package com.without.xml.project1;

public class Department {

	int Did;
	String Dname;
	
	public int getDid() {
		return Did;
	}
	public void setDid(int did) {
		Did = did;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	@Override
	public String toString() {
		return "Department [Did=" + Did + ", Dname=" + Dname + "]";
	}
	
	
}
