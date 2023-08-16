package com.Springcore.RemoveXMl;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext con=new AnnotationConfigApplicationContext(Javaconfig.class);
    		Student student=con.getBean("student",Student.class);
    		System.out.println(student);
    		student.name();
    		
     
        
    }
}
