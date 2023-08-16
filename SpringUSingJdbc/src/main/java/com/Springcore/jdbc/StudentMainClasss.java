package com.Springcore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

import Com.SpringCore.StudentDao.StudentDao;
import Com.SpringCore.StudentDao.StudentDaoImp;

public class StudentMainClasss {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("configJdbc.xml");
		
		StudentDaoImp studentDao= context.getBean("studentDao",StudentDaoImp.class);
		
//		Student student=new Student(6,"Akash","BBSR");
//		
//		int insert = studentDao.insert(student);
//		
//		System.out.println("Insert Successfully");
//		Student student1=new Student(6,"Smrrrr","BBS2");
//		int update = studentDao.update(student1);
//		System.out.println("Updated Succesfully"+update);
		
//		int studentId=6;
//		studentDao.delete(studentId);
		List<Student> student=studentDao.getStudents();
		
		for(Student s:student)
		{
			System.out.println(s.getName());
			System.out.println(s.getCity());
			System.out.println(s.getId());
		}
		
		
		
		
		
		
		
		
	}

}
