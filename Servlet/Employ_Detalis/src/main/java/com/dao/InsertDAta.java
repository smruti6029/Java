package com.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.Entity.*;
import com.connection.HibernateUtil;
public class InsertDAta {
public static int InsertDataMnager(Emp employes) 
	
	{
		Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	System.out.println(employes);	
    	Session session=factory.openSession();
    	
    	Transaction trn=session.beginTransaction();
    	int flag=(Integer) session.save(employes);	
    	trn.commit();
    	session.close();

    	return flag;
			
    	
    	
    }
	
	
	
}
