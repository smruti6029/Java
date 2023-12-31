package com.Service.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAO.Student.Result_DAO;
import com.DAO.Student.Student_DAO;
import com.DAO.Student.Subject_DAO;
import com.Entity.Student.Student;
import com.Entity.Student.StudentResult;
import com.Entity.Student.Subject;

import con.configu.student.JavaConfiguration;

public class AddResult {

	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfiguration.class);
	Result_DAO resultDao = con.getBean("result_dao", Result_DAO.class);
	Student_DAO studentDao = con.getBean("studentDao", Student_DAO.class);
	Subject_DAO subjectDao = con.getBean("subjectDao", Subject_DAO.class);

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public void addStudentWiseResult() throws IOException {

		int flag = 1;
		boolean vallidUser = false;
		List<Subject> subject = subjectDao.getAllSubject();
		System.out.println(subject);
		System.out.println("Enter Student gmail");
		String gmail = bf.readLine();
		Student student = studentDao.getBygmail(gmail);

		List<StudentResult> allStudentResult = resultDao.getAll();

		for (StudentResult student_res : allStudentResult) {
			if (student_res.getStudent().getId() == student.getId()) {

				vallidUser = false;
				break;
			} else {
				vallidUser = true;
				break;
			}
		}

		if (vallidUser) {
			ArrayList<StudentResult> studentmarks = new ArrayList();
			if (student != null) {

				for (Subject s : subject) {
					System.out.println(s.getSubject());
					System.out.println("Enter Marks");
					int marks = Integer.parseInt(bf.readLine());
					if (marks > 0 && marks < 100) {
						StudentResult obj = new StudentResult();
						obj.setMarks(marks);
						obj.setStudent(student);
						obj.setSubject(s);
						studentmarks.add(obj);
					} else {
						System.out.println("Enter again");
						flag = 0;
						break;
					}

				}
			}
			if (flag != 0) {
				resultDao.addResult(studentmarks);
			}
		}

		else {
			System.out.println("Mark already  added For This Student");
		}
	}

}
