package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class manager {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int mannger_id;
	private String name;
//	@OneToMany
//	@JoinColumn(name=" quality_id")
//	private quality quality;
//	

	@OneToMany(mappedBy = "manager")
	private List<devloper> devloper;
	
	@OneToMany(mappedBy = "manager")
	private List<quality> quality;
	public List<devloper> getDevloper() {
		return devloper;
	}
	public void setDevloper(List<devloper> devloper) {
		this.devloper = devloper;
	}
	public List<quality> getQuality() {
		return quality;
	}
	public void setQuality(List<quality> quality) {
		this.quality = quality;
	}
	public int getMannger_id() {
		return mannger_id;
	}
	public void setMannger_id(int mannger_id) {
		this.mannger_id = mannger_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public manager(int mannger_id, String name) {
		super();
		this.mannger_id = mannger_id;
		this.name = name;
	}
	public manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public manager(int manager_id) {
		this.mannger_id=manager_id;
	}

	
	
}
