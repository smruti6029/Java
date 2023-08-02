package com.mcq.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="question_option_answer")
public class AnswersForQuestion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String answers;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public AnswersForQuestion(int id, String answers, Question question) {
		super();
		this.id = id;
		this.answers = answers;
		this.question = question;
	}

	public AnswersForQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswersForQuestion(int id2) {
		this.id=id2;
	}

	

}
