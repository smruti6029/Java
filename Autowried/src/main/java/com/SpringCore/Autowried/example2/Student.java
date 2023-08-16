package com.SpringCore.Autowried.example2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	
	
	@Autowired
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
		return "" + subject + "";
	}
	
	
	
	
	

}
