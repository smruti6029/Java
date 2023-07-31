package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.Entity.*;

import com.service.GetResultByUserIdPassword;

public class GetAllResult {

	public static Emp gelResult(String email, String password)

	{

		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		String query = "FROM Emp WHERE email = :email";
		Emp user = session.createQuery(query, Emp.class).setParameter("email", email).uniqueResult();
//			System.out.println(user.getGender());

//			
		return user;

	}

}
