package com.without.xml.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	int eid;
	String ename;
	
	List<String> phones;
	
	@Autowired
	Department department;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", phones=" + phones + ", department=" + department + "]";
	}
	
	
	
	
}
