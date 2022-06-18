package com.without.xml.project1;

public class Company {

	int cid;
	String cname;
	public Company(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
