package com.DAO_FOR_MCQ;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.mcq.entity.AnswersForQuestion;
import com.mcq.entity.Question;


public class GetAllQesAns 

{

	public static List<Question> getAllQuestion() {
		
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.setProperty("hibernate.show_sql", "false");
		SessionFactory factory = conf.buildSessionFactory();	
		Session session=factory.openSession();
		Transaction trn=session.beginTransaction();
		List<Question> questions = session.createQuery("FROM Question", Question.class)
                .setMaxResults(5)
                .list();
		return questions;		
		
		
	}
	
	
//	Configuration conf=new Configuration();
//	conf.configure("hibernate.cfg.xml");
//	SessionFactory factory = conf.buildSessionFactory();	
//	Session session=factory.openSession();
//	
//	Transaction trn=session.beginTransaction();
//	System.out.println("All Manager Detalis");
//	manager manager=session.get(manager.class,id);
//		List<devloper> devloper =manager.getDevloper();
//		List<quality>  quality=manager.getQuality();
//				
//		for(devloper x:devloper)
//		{
//			System.out.println(x.getManager().getName()+"   "+x.getName());
//			System.out.println();
//		}
//		for(quality y:quality)
//		{
//			System.out.println(y.getManager().getName()+"   "+y.getName());
//		}
//	

}
