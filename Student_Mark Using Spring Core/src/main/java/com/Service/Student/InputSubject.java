package com.Service.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAO.Student.Student_DAO;
import com.DAO.Student.Subject_DAO;
import com.Entity.Student.Subject;

import con.configu.student.JavaConfiguration;

public class InputSubject {
	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfiguration.class);
	Subject_DAO dao = con.getBean("subjectDao", Subject_DAO.class);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void inputSubject() throws NumberFormatException, IOException {
		System.out.println("Enter How many Subject");
		int count = Integer.parseInt(br.readLine());

		while (count != 0) {
			System.out.println("Enter Subject Name");
			String subject = br.readLine();
			dao.insertSubject(new Subject(count, subject));
			count--;
		}

	}
}
