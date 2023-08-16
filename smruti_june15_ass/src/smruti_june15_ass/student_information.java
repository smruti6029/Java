package smruti_june15_ass;

import java.util.*;
class person{
	
	String  name;
	int Rollno;
	String address;
	int addmissionNumber;
	
	void displayInfo(String name , int studentId,	 String className,
			 double section) {
		
		   System.out.println("the student detail  are as follows ");	
		   
		
		}
	
} 

class Student extends person{
	
	String name;
	 int studentId;
	 String className;
	 double section;
	
	void displayInfo(String name , int  studentId,	 String className,
	 double section) {
		
		
		  
		   float b = studentId ;  
		   int a = (int) b; 
		   
		   double c = section;
		   int d = (int) section;
		
	   System.out.println("the student detail  are as follows " + name);
	   System.out.println(a +"      "+ className+"  "+ d );
	 
	
	}
	}public class student_information{

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER NAME :=");
			String name=sc.nextLine();
			System.out.println("ENTER ROLL NO /STUDENT ID");
			int roll=sc.nextInt();
			System.out.println("CLASS  :=   ");
			String classname=sc.next();
			System.out.println("ENTER SECTION");
			double section=sc.nextDouble();
			
			
			
			
			
			
			person p = new Student();
			p.displayInfo(name , roll, classname ,section );

		}

	}




