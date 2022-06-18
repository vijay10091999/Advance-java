package com.spring.orm.without.xml;

import java.util.List;


public interface StudentDao {

	public int insert(Student student);
	public void update(Student student);
	public void delete(int sid);
	public Student getstudent(int sid);
	public List<Student> getallstudent();
}
