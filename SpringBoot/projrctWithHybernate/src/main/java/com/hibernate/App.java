package com.hibernate;


import org.hibernate.Session;
import java.util.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.*;

import antlr.collections.List;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = conf.buildSessionFactory();
    	Employes st=new Employes(4,"Rapift","BB","141",new EmployBranch(1));
    	System.out.println(st);
    	
    	Session session=factory.openSession();
    	
//    	session.save(st);

    	
    	Transaction trn=session.beginTransaction();
    	 // For Update
//      Employee emp = session.get(Employee.class, 2);
//      emp.setName("Smruti Ranjan Nayak");
//      session.update(emp);
//      System.out.println(emp.getName());
      
      // For Get All Employees
//      
//      String hibernateQuery = "from Employes";
//     ArrayList<Employes> employees = (ArrayList<Employes>) session.createQuery(hibernateQuery, Employes.class).getResultList();
//      for(Employes employee : employees) {
//      	System.out.println("Name: " + employee.getName());
//      	System.out.println("ID: " + employee.getEmp_code());
//      	System.out.println("Address: " + employee.getAddress());
//      }
//      
      // Get By ID
//      
      Employes getEmpById = session.get(Employes.class, 2);
      System.out.println("Employee Code: " + getEmpById.getId());
      System.out.println("Employee Name: " + getEmpById.getName());
      System.out.println("Employee Address: " + getEmpById.getAddress());
      System.out.println("Employ Branch  "+getEmpById.getEmp_branch().getBranch());
//    	
    	
    	
//    	Employes employes = session.get(Employes.class,1);
//    	System.out.println(employes.toString());
//    	session.delete(employes);
//    	System.out.println("eMPLOY DELETED");
    	
//    	String address = employes.getAddress();
   
    	
    	trn.commit();
    
    	session.close();
    	
   
 
    	
    	
    }
}
 