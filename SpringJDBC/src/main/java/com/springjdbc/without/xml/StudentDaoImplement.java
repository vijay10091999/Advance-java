package com.springjdbc.without.xml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component("studentdao")
public class StudentDaoImplement implements StudentDao{

    @Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int res = this.jdbcTemplate.update(query,student.getId(), student.getName(),student.getCity());
		return res;
	}

	public int change(Student student) {
		String query = "update student set name=? , city=? where id = ? ";
		int res = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}

	public int delete(int sid) {
		String query = "delete from student where id = ? ";
		int res = this.jdbcTemplate.update(query,sid);
		return res;
	}

	public Student getstudent(int sid) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student student1 = this.jdbcTemplate.queryForObject(query,rowMapper, sid);
		return student1;
		}

	

		public List<Student> getallstudent() {
			String query = "select * from student";
			List<Student> student1 = this.jdbcTemplate.query(query,new RowMapperImp());
			return student1;
		}

		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

	
}
