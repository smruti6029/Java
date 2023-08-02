package com.Teacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;

import org.hibernate.Transaction;

@Entity
public class Branch 
{
	
	@Id
	@Column(name= "Teacher id")
	private int id;
	private String subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Branch(int id, String subject) {
		super();
		this.id = id;
		this.subject = subject;
	}
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
