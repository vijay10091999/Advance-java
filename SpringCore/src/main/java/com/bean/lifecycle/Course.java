package com.bean.lifecycle;

public class Course {
	int cid;
	String cname;
	
	public void init() {
		System.out.println("Inside init method");
	}

	public void destroy() {
		System.out.println("Inside destory method");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
		System.out.println("value set by course id");
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
		System.out.println("value set by course name");
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
}
