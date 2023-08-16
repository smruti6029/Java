package com.Springcore.Scope;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("com/Springcore/Scope/list.xml");
        Student student1 = con.getBean("student",Student.class);
        System.out.println(student1);    
     
        
        Student student2 = con.getBean("student",Student.class);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        
        
    }
}
