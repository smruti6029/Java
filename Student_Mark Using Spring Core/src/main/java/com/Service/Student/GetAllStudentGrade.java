package com.Service.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAO.Student.Result_DAO;
import com.DAO.Student.Student_DAO;
import com.DAO.Student.Subject_DAO;
import com.Entity.Student.Student;
import com.Entity.Student.StudentResult;
import com.utility.StudentMArk.StudentGrade;

import con.configu.student.JavaConfiguration;

public class GetAllStudentGrade {
	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfiguration.class);
	Result_DAO resultDao = con.getBean("result_dao", Result_DAO.class);
	Student_DAO studentDao = con.getBean("studentDao", Student_DAO.class);
	Subject_DAO subjectDao = con.getBean("subjectDao", Subject_DAO.class);

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public void getAll() {

		List<Student> allStudents = studentDao.getAll();
		for (Student student : allStudents) {

			List<StudentResult> AllSubresult = resultDao.getresultByStudent(student.getId());
			ArrayList<Integer> marks = new ArrayList();
			int mark = 0;

			if (AllSubresult != null) {

				for (StudentResult res : AllSubresult) {
					mark += res.getMarks();
					marks.add(res.getMarks());
				}
				double percentage = mark / 6;
				String Grade = StudentGrade.calculateGrade(percentage, marks);
				System.out.println("-------------------------------");
				System.out.println("Student Roll No :" + student.getId());
				System.out.println("Name Of The Student :-" + student.getName());
				System.out.println("gmail Of the Student :-" + student.getEmail());
				System.out.println("                                 ");

				AllSubresult.forEach(rs -> {
					System.out.println("Subject :" + rs.getSubject().getSubject());
					System.out.println("Marks : " + rs.getMarks());
					System.out.println("----------------");

				});
				System.out.println("Total Marks :-" + mark);
				System.out.println("Grade :-" + Grade);
				System.out.println("Percentage :-" + percentage);
				System.out.println("------------------------");
				System.out.println("           ");

			} else {
				System.out.println("Invalid Credentials");
			}
		}

	}

}
