package com.DouEmploy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.*;


public class UpdateDataInTable {

	public static void UpdateDataInTable(int id, String name) {
		
		Configuration conf=new Configuration();
		System.out.println("Hello");
    	conf.configure("hibernate-cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction trn=session.beginTransaction();
    	Employes  emp = session.get(Employes .class, id);
    	emp.setName(name);
    	session.update(emp);
    	trn.commit();
    	System.out.println(emp.getName());
    	session.close();
    	factory.close();
      
	}

}
