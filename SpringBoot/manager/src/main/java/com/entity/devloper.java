package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class devloper {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="manager_id")
	private manager manager;
	public devloper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public devloper(int id, String name, com.entity.manager manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public manager getManager() {
		return manager;
	}
	public void setManager(manager manager) {
		this.manager = manager;
	}

}
