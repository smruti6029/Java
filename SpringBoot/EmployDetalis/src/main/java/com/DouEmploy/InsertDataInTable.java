package com.DouEmploy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hybernate.demo.*;

import com.entity.Employes;

public class InsertDataInTable {

	public static void InsertDataInTable(Employes employes) 
	
	{
		Configuration conf=new Configuration();
		System.out.println("Hello");
    	conf.configure("hibernate-cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	System.out.println(employes);

    	Session session=factory.openSession();
    	session.save(employes);	
    	Transaction trn=session.beginTransaction();
//    	
//    	
//    	Employes employes = session.get(Employes.class,1);
//    	System.out.println(employes.getAddress());
//    	System.out.println(employes.toString());
//    	
//    	String address = employes.getAddress();
//    	System.out.println(address);
//    	
//    	
    	trn.commit();
//    
    	session.close();
//    	
//   
 
    	
    	
    }
		
		
	}


