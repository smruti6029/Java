package com.TeacherManagement.Teacher;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.teacher.*;

import com.subject.Subject;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
//    	Teacher t1=new Teacher();
//    	t1.setId(22);
//    	t1.setName("Sandeep Bali");
    	Subject s1=new Subject();
    	s1.setId(23);
    	s1.setSubject_name("CSE");
    	Session session=factory.openSession();
    
 	
    	Transaction trn=session.beginTransaction();
//    	session.save(t1);
//    	session.save(s1);
//    	 Subject sub = session.get(Subject.class, 23);
//    	 sub.setTeacher(new Teacher(1));
//    	 Teacher tea=session.get(Teacher.class,1);
//    	 tea.setSubject(new Subject(23));
////    	 session.saveOrUpdate(tea);
//    	 session.saveOrUpdate(sub);
    	 
    	System.out.println("Teacher Data");
        Teacher getTeacher = session.get(Teacher.class, 1);
        System.out.println("Teacher Name: " + getTeacher.getName());
        System.out.println("Subject Name: " + getTeacher.getSubject().getSubject_name());
        
        
        System.out.println("Teacher Data");
        Subject getSubject = session.get(Subject.class, 23);
        System.out.println("Teacher Name: " + getSubject.getTeacher().getName());
        System.out.println("Subject Name: " + getSubject.getSubject_name());
	
	
    	
    	
    	trn.commit();
    	session.close();
    	
    }
}
