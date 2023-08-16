package com.Dao.Student;

import java.util.List;

import com.Entity.Student.Student;



public interface StudentDao {
			public int insert(Student student);
			public int update(Student student);
			public void delete(int id);
			public List<Student> getStudents();
			public Student getStudentById(int id);
			
}
