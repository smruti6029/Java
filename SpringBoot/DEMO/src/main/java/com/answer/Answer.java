package com.answer;

import com.question.Question;

public class Answer {
	private int answer_id;
	private String answer;
	
	private Question question;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answer_id, String answer, Question question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	
}
