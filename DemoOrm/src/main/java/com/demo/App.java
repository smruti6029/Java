package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Employ;
import com.dao.employ.EmployDaoImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployDaoImp dao=context.getBean("employDaoImpl",EmployDaoImp.class);
        
        
//        Insert
//        Employ obj=new Employ(1,"Sandeep","9333322");
//        int insert = dao.insert(obj);
//        System.out.println("Insert SUccesfully"+insert);
        
//        update 
//        Employ obj=new Employ(1,"MAnajit","9333322");
//        int update = dao.update(obj);
//        System.out.println("Update SUccessfully"+update);
//        
        
//        Get  by id
//        Employ employ = dao.getId(1);
//        System.out.println(employ);
        
        
        
//        delete
//        	dao.delete(1);
        
        
//        Get All
        List<Employ> employes = dao.getAll();
        for(Employ e:employes)
        {
        	System.out.println(e);
        }
        
        
    }
}
