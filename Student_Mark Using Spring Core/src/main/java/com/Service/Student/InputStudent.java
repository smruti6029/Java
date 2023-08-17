package com.Service.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAO.Student.Student_DAO;
import com.Entity.Student.*;

import con.configu.student.JavaConfiguration;

public class InputStudent {
	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfiguration.class);
	Student_DAO dao = con.getBean("studentDao", Student_DAO.class);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void inputStudent() throws IOException {

		System.out.println("Enter Student Name");
		String name = br.readLine();

		System.out.println("Enter Student Gamil");
		String gmail = br.readLine();

		System.out.println("Enter Student id");
		int rollNo = Integer.parseInt(br.readLine());

		Student bygmail = dao.getBygmail(gmail);
		if (bygmail == null) {

			Student student = new Student(rollNo, name, gmail);

			int insert = dao.insert(student);
		} else {
			System.out.println("Student already exit");
		}

	}
}
