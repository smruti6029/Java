package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployBranch {
	@Id
	private int id;
	private String branch;
	
	public String getBranch() {
		return branch;
	}
	public EmployBranch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public EmployBranch(int id, String branch) {
		super();
		this.id = id;
		this.branch = branch;
	}
	
	public EmployBranch(int id)
	{
		this.id=id;
	}

}
