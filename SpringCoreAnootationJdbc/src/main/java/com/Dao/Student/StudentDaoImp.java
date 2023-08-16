package com.Dao.Student;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.Entity.Student.Student;




@Component("getStudentDao")
public class StudentDaoImp implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String qry="insert into student (id,name,city)values(?,?,?)";
		this.jdbcTemplate.update(qry,student.getId(),student.getName(),student.getCity());
		System.out.println("sdfh");
		return 0;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) 
	{
		try
		{
		String qry="update  student set name=?,city=? where id=?";
		int update = this.jdbcTemplate.update(qry,student.getName(),student.getCity(),student.getId());
		
		return update;
		}
		catch(Exception e)
		{
			System.out.println("USer Does't Exit");
			return 0;
			
		}
		
		
		
		
	}
	public void delete(int id)
	{
		
		String sql = "DELETE FROM student WHERE id = ?";
		int update = this.jdbcTemplate.update(sql,id);
		System.out.println(update);
		
	}
	public List<Student> getStudents() {
	    String query = "SELECT * FROM student";
	    List<Student> students = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Student.class));
	    return students;
	}

	public Student getStudentById(int id) {
		try
		{
	    String query = "SELECT * FROM student WHERE id = ?";
	     Student queryForObject = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<Student>(Student.class), id);
	     return queryForObject;
		} 
		catch(Exception e)
		{
			
			return null;
		}
	}



	}

	


