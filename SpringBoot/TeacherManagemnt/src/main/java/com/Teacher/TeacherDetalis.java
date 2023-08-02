package com.Teacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TeacherDetalis 
{
	@Id
	@Column
	private int id;
	private String Teacher;
	
	@OneToOne
	private Branch branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacher() {
		return Teacher;
	}
	public void setTeacher(String teacher) {
		Teacher = teacher;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public TeacherDetalis(int id, String teacher, Branch branch) {
		super();
		this.id = id;
		Teacher = teacher;
		this.branch = branch;
	}
	public TeacherDetalis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
