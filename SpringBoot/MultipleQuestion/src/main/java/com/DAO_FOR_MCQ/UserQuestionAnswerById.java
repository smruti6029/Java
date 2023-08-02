package com.DAO_FOR_MCQ;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.mcq.entity.User_Input_Answer;

public class UserQuestionAnswerById {

	public static List<User_Input_Answer> getQuestionanswer() 
	{
		
		
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();	
		Session session=factory.openSession();
		Transaction trn=session.beginTransaction();
		String query = "From User_Input_Answer";
		List<User_Input_Answer> userAnswerList = session.createQuery(query, User_Input_Answer.class)
				.getResultList();
		
//		for(User_Input_Answer ans : userAnswerList) {
//			System.out.println(ans.getQuestion().getId());
//			System.out.println(ans.getAns().getId());
//		}
		
//		User_Input_Answer ans=session.get(User_Input_Answer.class, 44);
//		System.out.println(ans.getAns().getId());
//		System.out.println(ans.getQuestion().getId());
//		System.out.println("sqdvwdckh");
		
		return userAnswerList ;
		
	}

}
