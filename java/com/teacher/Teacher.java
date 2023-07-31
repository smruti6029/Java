package com.teacher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.subject.Subject;

@Entity
public class Teacher 
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String name;
	
	public Teacher(int id, String name, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	@JoinColumn(name="subject_id")
	@OneToOne
	private Subject subject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int i) {
		super();
		this.id=i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
