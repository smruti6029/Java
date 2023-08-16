package com.Springcore.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/Springcore/Autowired/autowried.xml");
    	Student obj=context.getBean("Student",Student.class);
    	System.out.println(obj);
    	
    }
    
    
}
