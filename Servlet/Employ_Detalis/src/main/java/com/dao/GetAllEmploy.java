package com.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Emp;

public class GetAllEmploy {

	public static List<Emp> getEmploy() 
	
	
	{
		
		
		Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();	
    	Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String query = "From Emp";
		List<Emp>  allEmploy = session.createQuery(query, Emp.class).getResultList();
		session.close();
		
		return allEmploy;
	}

//	public static void main(String[]args)
//	{
//		List<Emp>  allEmploy=getEmploy();
//		for(Emp x:allEmploy)
//		{
//			System.out.println(x.getName());
//		}
//		
//		
//	}
}
