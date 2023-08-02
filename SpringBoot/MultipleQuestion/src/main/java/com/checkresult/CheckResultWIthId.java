package com.checkresult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.DAO_FOR_MCQ.AnswerTable;
import com.DAO_FOR_MCQ.GetUserDetalisByID;
import com.DAO_FOR_MCQ.UserQuestionAnswerById;
import com.mcq.entity.QuestionWithAnswer;
import com.mcq.entity.User_Input_Answer;
import com.mcq.entity.UsersInputClass;

public class CheckResultWIthId {

	public static void checkResultById() throws NumberFormatException, IOException 
	
	
	{
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User Id");
		int user_id=Integer.parseInt(bf.readLine());

		UsersInputClass user=GetUserDetalisByID.getUser(user_id);
		
		
		 List<User_Input_Answer> userquestionanswer = UserQuestionAnswerById.getQuestionanswer();
		 List<QuestionWithAnswer> RightAnswer=AnswerTable.answerTable();
		 
		 Integer marks = 0;
		 
		 for (QuestionWithAnswer orginalAnswer : RightAnswer) {
		 
		 	for (User_Input_Answer userAnswer : userquestionanswer) {
		 		if (userAnswer.getUser().getId() == user_id) {
		 			if (userAnswer.getQuestion().getId() == orginalAnswer.getQuestion().getId()) {
		 				if (userAnswer.getAns().getId() == orginalAnswer.getAnswer().getId()) {
		 					marks++;
		 				}
		 			}
		 		}
		 	}

		 
		 }
		 System.out.println(user.getName()+"    " + user.getEmail()+" Mark-  "+ marks);
		 	
		
		
		
	}

}

