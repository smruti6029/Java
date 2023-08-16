package com.Springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("configJdbc.xml");
        JdbcTemplate con=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        String que="insert into student (id,name,city)values(?,?,?)";
        
        int res = con.update(que,1,"Manajit","Cuttack");
        System.out.println("The Insert Succesfully"+res);
        
        
        
    }
}