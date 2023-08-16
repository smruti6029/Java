package com.Springcore.Stereotype;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("com/Springcore/Stereotype/list.xml");
        Student list = con.getBean("student",Student.class);
        System.out.println(list);       
        
    }
}
