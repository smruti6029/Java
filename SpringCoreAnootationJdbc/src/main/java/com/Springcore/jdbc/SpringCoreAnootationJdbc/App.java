package com.Springcore.jdbc.SpringCoreAnootationJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import java.io.*;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.Student.StudentDaoImp;
import com.Entity.Student.Student;
import com.configuration.student.javConfiguration;


public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(javConfiguration.class);
        
        StudentDaoImp studentDao = context.getBean("getStudentDao",StudentDaoImp.class);
        
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int input;
        while(true)
        {
        	Student student = new Student();
        	System.out.println("Enter 1 to add");
        	System.out.println("Enter 2 delete by id");
        	System.out.println("Enter 3 to update");
        	System.out.println("Enter 4 to See all Student");
        	System.out.println("Enter 5 to see by Student id");
        	System.out.println("Enter 6  Exit");
        	input=Integer.parseInt(sc.readLine());
        		
        	if(input==1)
        	{
        		System.out.println("Enter Name");
        		String name=sc.readLine();
        		System.out.println("Enter City");
        		String city=sc.readLine();
        		System.out.println("Enter Id");
        		int roll=Integer.parseInt(sc.readLine());
        		student.setCity(city);
        		student.setId(roll);
        		student.setName(name);
        		studentDao.insert(student);
        		System.out.println("Student Inserted Succesfully");	
        	}
        	if(input==2)
        	{
        		System.out.println("Enter id to delete");
        		int id=Integer.parseInt(sc.readLine());
        		studentDao.delete(id);
        		System.out.println("Delete SUcesfully");
        		
        		
        	}
        	if(input==3)
        	{
        		System.out.println("Enter Id");
        		int roll=Integer.parseInt(sc.readLine());

        		System.out.println("Enter Name");
        		String name=sc.readLine();
        		System.out.println("Enter City");
        		String city=sc.readLine();
        		        		student.setCity(city);
        		student.setId(roll);
        		student.setName(name);
        		studentDao.update(student);
        		System.out.println("Student updated Succesfully");
        	}
        	if(input==4)
        	{
        		List<Student> student1=studentDao.getStudents();
        		
        		for(Student s:student1)
        		{
        			System.out.println(s.getName());
        			System.out.println(s.getCity());
        			System.out.println(s.getId());
        			System.out.println("----------------------------------------");
        		}
        	}
        	
        	if(input==5)
        	{
        		System.out.println("Enter Id");
        		int id=Integer.parseInt(sc.readLine());
        		Student studentById = studentDao.getStudentById(id);
        		if(studentById!=null)
        		{
        			
        	
        		System.out.println(studentById.getName());
        		System.out.println(studentById.getCity());
        		System.out.println(studentById.getId());
        		System.out.println("----------------------------------------");
        		
        		}
        		else
        		{
        			System.out.println("Does t exit");
        		}
        		
        		
        	}
        	if(input==6)
    		{
    			break;
    		}
        }
        
        
       
    }
}
