package com.subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.teacher.Teacher;

@Entity
public class Subject 

{
	@Id
	private int id;
	private String subject_name;
	
	
	@JoinColumn(name="teacher_id")
	@OneToOne
	private Teacher teacher;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSubject_name() {
		return subject_name;
	}


	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public Subject(int id, String subject_name, Teacher teacher) {
		super();
		this.id = id;
		this.subject_name = subject_name;
		this.teacher = teacher;
	}


	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Subject(int i) {
		super();
		
		this.id=i;
		// TODO Auto-generated constructor stub
	}


	
	
	

}
