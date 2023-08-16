package com.Springcore.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Show 
{
	
	@Bean
	public Demo getDemo()
	{
		Demo obj=new Demo();
		return obj;
		
	}
	

}
