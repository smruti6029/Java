package com.mcq.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question 
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id;
	
//	int question_id;
	String question;
	
	@OneToMany(mappedBy = "question")
	private  List <AnswersForQuestion> answers;

	@OneToOne
	private User_Input_Answer user;
	
	
	public Question(int id, String question, List<AnswersForQuestion> answers, User_Input_Answer user) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
		this.user = user;
	}

	public User_Input_Answer getUser() {
		return user;
	}

	public void setUser(User_Input_Answer user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswersForQuestion> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswersForQuestion> answers) {
		this.answers = answers;
	}

	public Question(int id, int question_id, String question, List<AnswersForQuestion> answers) {
		super();
		this.id = id;
//		this.question_id = question_id;
		this.question = question;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
