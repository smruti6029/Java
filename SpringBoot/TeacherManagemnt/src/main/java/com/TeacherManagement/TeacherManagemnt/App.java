package com.TeacherManagement.TeacherManagemnt;
import com.Teacher.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	
    	
		SessionFactory factory=conf.buildSessionFactory();
//		create
		TeacherDetalis t1=new TeacherDetalis();
		t1.setId(1);
		t1.setTeacher("Smruti Ranjan Nayak");
		
//		create branch
		Branch b1=new Branch();
		b1.setId(33);
		b1.setSubject("CSE");
		t1.setBranch(b1);
		
		TeacherDetalis t2=new TeacherDetalis();
		t1.setId(2);
		t1.setTeacher("Sandeep Bali");
		
//		create branch
		Branch b2=new Branch();
		b1.setId(34);
		b1.setSubject("MCA");
		t1.setBranch(b2);
    	
		
		
		Session s=factory.openSession();
   
    	
    	
    Transaction tx=s.beginTransaction();
    	s.save(t1);
    	s.save(t2);
    	
    	tx.commit();
    	
    	

    	factory.close();
    	s.close();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    }
}
