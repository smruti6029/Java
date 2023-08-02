package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Messages {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String messages;
	
	
	@ManyToOne
	@JoinColumn(name="sender_id")
	private Users sender;
	
	@ManyToOne
	@JoinColumn(name="reciver_id")
	private Users reciver;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public Users getSender() {
		return sender;
	}

	public void setSender(Users sender) {
		this.sender = sender;
	}

	

	public Users getReciver() {
		return reciver;
	}

	public void setReciver(Users reciver) {
		this.reciver = reciver;
	}

	public Messages(int id, String messages, Users sender, Users reciver) {
		super();
		this.id = id;
		this.messages = messages;
		this.sender = sender;
		this.reciver = reciver;
	}

	public Messages() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
