package com.Set;
import java.util.*;
import java.time.*;
	
	class Employ
	{
		String name;
		int age;
		String phone;
		int id,n;
		 Employ(String name,int age,int id,String phone,int n) 
		 {
			 LocalDate date=LocalDate.now();
			 int yyyy=date.getYear(); 
			 this.name=name;
			 this.age=yyyy-age;
			 this.id=id;
			 this.phone=phone;
			 this.n=n;
		 }
		 public String toString()
		 {
			 if(age>n)
			 {
				System.out.println("NAME -"+name+" Age "+age+"  Id "+id+" Phone "+phone);  
			 }
			 return "";
		 }
		 public int convet(int dd,int mm,int yy)
		 {
			
			 
			 return 0;
		 }
		
		
	}

	public class CollectionInJava {
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter how many age you want to Extract");
			int n=sc.nextInt();
			List<Employ> list=new ArrayList<>();
			
			
			list.add(new Employ("Smruti",1999,1,"9348879015",n));
			list.add(new Employ("Biswajit",2001,2,"93489790",n));
			list.add(new Employ("Manajit",2005,3,"93686790",n));
			list.add(new Employ("Sandeep",2008,4,"93486790",n));
			list.add(new Employ("Ashis",2010,5,"93406790",n));
			list.toString();
		}

	}

