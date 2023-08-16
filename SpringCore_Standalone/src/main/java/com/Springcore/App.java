package com.Springcore;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("com/Springcore/list.xml");
        Student list = con.getBean("list1",Student.class);
        System.out.println(list);

        ArrayList<String> lis=(ArrayList<String>) list.getSubject();
        
        Iterator<String> subject=lis.iterator();
        while(subject.hasNext())
        {
        	System.out.println(subject.next());
        }
        System.out.println(list.getSubject().getClass().getName());
        System.out.println(list.getCourse().getClass().getName());
        System.out.println(list.getProperties().getClass().getName());
        
    }
}
