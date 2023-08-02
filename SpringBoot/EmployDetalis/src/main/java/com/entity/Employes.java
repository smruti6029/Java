package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employes 
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String name;
	private String  address;
	private String emp_code;
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
	public String getAddress() {
		return address;	
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public Employes(int id, String name, String address, String emp_code) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.emp_code = emp_code;
	}
	public Employes() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employes [id=" + id + ", name=" + name + ", address=" + address + ", emp_code=" + emp_code + "]";
	}
	public Employes(String name, String address, String emp_code) {
		super();
		this.name = name;
		this.address = address;
		this.emp_code = emp_code;
	}
	
	
	
	
}
