package com.ManagerDao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.devloper;
import com.entity.manager;
import com.entity.quality;



public class DataInsert {
	
public static void InsertDataMnager(manager employes) 
	
	{
		Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	System.out.println(employes);	
    	Session session=factory.openSession();
    	session.save(employes);	
    	Transaction trn=session.beginTransaction();
    	trn.commit();
    	session.close();
    	
    	
    }
  public static void InsertDataDevloper(List<devloper> devList) 

{
				Configuration conf=new Configuration();
				conf.configure("hibernate.cfg.xml");
				SessionFactory factory = conf.buildSessionFactory();
				System.out.println(devList);	
				Session session=factory.openSession();
				devList.forEach((v)->{
					
					session.save(v);
					
				});
				
				
				Transaction trn=session.beginTransaction();
				trn.commit();
				session.close();
	
	
}
  
  public static void InsertDataQuality(quality quality) 

  {
  				Configuration conf=new Configuration();
  				conf.configure("hibernate.cfg.xml");
  				SessionFactory factory = conf.buildSessionFactory();
  				System.out.println(quality);	
  				Session session=factory.openSession();
  				session.save(quality);	
  				Transaction trn=session.beginTransaction();
  				trn.commit();
  				session.close();
  	
  	
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
