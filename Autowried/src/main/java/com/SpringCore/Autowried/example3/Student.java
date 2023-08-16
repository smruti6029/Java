package com.SpringCore.Autowried.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	
	private String studentId;
	
	
	@Autowired
	@Qualifier("temp2")
	private Subject subject;

	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		System.out.println("Set Subject");
		this.subject = subject;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", subject=" + subject + "]";
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Student(String studentId, Subject subject) {
		super();
		this.studentId = studentId;
		this.subject = subject;
	}
	
	
	
	
	

}
