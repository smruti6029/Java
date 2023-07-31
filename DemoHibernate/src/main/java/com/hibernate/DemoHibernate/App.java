package com.hibernate.DemoHibernate;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.show.Show;


import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	Session session=factory.openSession();
        
     	
    	Transaction trn=session.beginTransaction();
    	trn.commit();
    	session.close();
      
    }
}