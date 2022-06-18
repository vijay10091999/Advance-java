package com.spring.orm.without.xml;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDaoImp implements StudentDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

 @Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);

	}

 @Transactional
	public void delete(int sid) {
	Student s3 = this.hibernateTemplate.get(Student.class, sid);
	this.hibernateTemplate.delete(s3);

	}

 
	public Student getstudent(int sid) {
		Student s =	this.hibernateTemplate.load(Student.class, sid);
		return s;
	}

	public List<Student> getallstudent() {
    List<Student> s1 = this.hibernateTemplate.loadAll(Student.class);
		return s1;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	
}
