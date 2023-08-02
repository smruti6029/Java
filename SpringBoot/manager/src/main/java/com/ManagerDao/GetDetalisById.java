package com.ManagerDao;
import com.entity.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.manager;



public class GetDetalisById {

	public static void getDetalis(int id) 
	
	{

		Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();	
    	Session session=factory.openSession();
 	
    	Transaction trn=session.beginTransaction();
    
		
		System.out.println("devloper");
        devloper  getdevloper= session.get(devloper.class, id);
        System.out.println("devloper  " + getdevloper.getName());
        System.out.println("Manager  "+getdevloper.getManager().getName());
     
        
    	
    	session.close();
		
	}
	public static void getAllDetslis(int id)
	{
		Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();	
    	Session session=factory.openSession();
 	
    	Transaction trn=session.beginTransaction();
    	System.out.println("All Manager Detalis");
    	manager manager=session.get(manager.class,id);
    		List<devloper> devloper =manager.getDevloper();
    		List<quality>  quality=manager.getQuality();
    				
    		for(devloper x:devloper)
    		{
    			System.out.println(x.getManager().getName()+"   "+x.getName());
    			System.out.println();
    		}
    		for(quality y:quality)
    		{
    			System.out.println(y.getManager().getName()+"   "+y.getName());
    		}
	}

}
