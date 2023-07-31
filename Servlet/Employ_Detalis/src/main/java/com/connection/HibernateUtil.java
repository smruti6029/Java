package com.connection;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import com.Entity.*;

public class HibernateUtil {
	
	private static SessionFactory sessionFcatory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFcatory == null) {
			
			Configuration configuraton =new Configuration();
			
		    Properties properties  =  new Properties();
		    
		    properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		    properties.put(Environment.URL, "jdbc:mysql://localhost:3306/employ");
		    properties.put(Environment.USER, "root");
		    properties.put(Environment.PASS, "password");
		    properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		    properties.put(Environment.HBM2DDL_AUTO, "update");
		    properties.put(Environment.SHOW_SQL, true);
		    
		    
		    configuraton.setProperties(properties);
		    
		 
		    configuraton.addAnnotatedClass(Emp.class);
		    
		  ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuraton.getProperties()).build();
		  
		  
		  
		  
		 sessionFcatory= configuraton.buildSessionFactory(serviceRegistry);
		
		}
		
		
		
		return sessionFcatory;
		
	}
	

}
