package com.Collection;
import java.util.*;
import java.time.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

 class Employ {
	
	
		String name;
		int age;
		String phone;
		int id;
		int age1;
		 Employ(String name,String dob,int id,String phone,int age1) throws ParseException
		 {
			 this.age1=age1;
			 this.name=name;
			 this.age=calculateAge(dob);
			 this.id=id;
			 this.phone=phone;
		 }
		 public String toString()
		 {
			 if(age>age1)
			 {
				 System.out.println(name+"  age= "+age+" id= "+id+" phone= "+phone) ; 
			 }
			return "";
		 }
		 public int calculateAge(String dob) throws ParseException
		 
		 {
			 String dobe=dob;
			 
			 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date date = sdf.parse(dobe);
				long birthYearInMilliseconds = date.getTime();
				Date today = new Date();
				long currentYearInMilliseconds = today.getTime();
				long ageInMilliseconds = currentYearInMilliseconds - birthYearInMilliseconds;
				long age = ageInMilliseconds / 31556952000L;
				
				
				
			 return (int)age;
		 }
		
		
	}

	public class EmployData{
		public static void main(String[]args) throws ParseException
		{
			List<Employ> list=new ArrayList<>();
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter The age You want to extract");
			int age=Sc.nextInt();
			list.add(new Employ("Smruti","14-04-2001",1,"9348879015",age));
			list.add(new Employ("Biswajit","22-07-2000",2,"93489790",age));
			list.add(new Employ("Manajit","17-09-1998",3,"93686790",age));
			list.add(new Employ("Sandeep","30-09-1997",4,"93486790",age));
			list.add(new Employ("Ashis","16-05-1999",5,"93406790",age));
			list.toString();
		}

	}


