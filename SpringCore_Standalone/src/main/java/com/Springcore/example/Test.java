package com.Springcore.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	
	ApplicationContext context=new AnnotationConfigApplicationContext(Show.class);
	Demo obj=context.getBean("getDemo",Demo.class);
	System.out.println(obj);
	Demo2 obj2=new Demo2(obj);
	System.out.println(obj2);

}
}

