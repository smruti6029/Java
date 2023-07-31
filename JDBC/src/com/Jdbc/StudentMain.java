package com.Jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;

public class StudentMain 
{
	public static void main(String[] args) throws NumberFormatException, Exception 
	{
		String name,address;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println(" Enter 1 to Add \n Enter 2 For Show Table Data \n Enter 3 For Update \n Enter 4 for Delete \n Enter 5 to exit");
			Integer input=Integer.parseInt(br.readLine());
			if(input==1)
			{
				System.out.println("Enter Student Addreass ,Student Name");
				
				name=br.readLine();
				address=br.readLine();
				boolean inserted=StudentDaO.createStudent(new Student(name,address));
				if(inserted)
				{
					System.out.println("Student added");
				}
				
			}
			if(input==2)
			{
				ResultSet set = StudentDaO.getAllvalues();
				 while (set.next()) 
				 {
				        int id = set.getInt(1);
				        String name1 = set.getString(2);
				        String address1 = set.getString(3); // Assuming address is in the third column
				        System.out.println("ID: " + id + ", Name: " + name1 + ", Address: " + address1);
				    }
			}
			else if(input==3)
			{
				System.out.println("Enter Student id UPdate");
				int id=Integer.parseInt(br.readLine());
				System.out.println(" Name  ");
				System.out.println(" Addreass");
				
				name=br.readLine();
				address=br.readLine();
				
				
				
				boolean inserted=StudentDaO.updateStudent(id,name,address);
				if(inserted)
				{
					System.out.println("Student Ubdatead");
				}
				else
				{
					System.out.println("Student Ubdated Falid");
				}
			}
			
			
			
			
			else if(input==4)
			{
				System.out.println("Enter Student Id to deleete");
				int input2=Integer.parseInt(br.readLine());
				boolean delete=StudentDaO.deleateStudent(input2);
				if(delete)
				{
					System.out.println("Deleted Succesfully");
				}
				else
				{
					System.out.println("Delete Falid");
					System.out.println("There Is No Student in"+input);
				
				}
			}
			else
			{
				if(input==5)
				{
					System.out.println("Exiting................");
					break;
				}
			
				System.out.println("Enter  Vallid Input");
				
			}
			
		}
		
	}
}
