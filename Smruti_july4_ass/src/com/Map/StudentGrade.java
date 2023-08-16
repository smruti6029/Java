//Write a Java method that takes a map of student names and their 
//corresponding grades as parameters and returns the name of the student
//with the highest grade.

package com.Map;
import java.util.*;

class Student
{
	public static String avarageGrade(Map<String,Integer> studentlist)
	{
		int min=Integer.MIN_VALUE;
		String name = null;
		for(String x:studentlist.keySet())
		{
			if(studentlist.get(x)>min)
			{
			min=studentlist.get(x);
			name=x;
			}
		}
		return name;
		
	}
}

	


public class StudentGrade {
	public static void main(String[] args) {
		Map<String,Integer> studentlist=new HashMap<>();
		studentlist.put("Smruti",98);
		studentlist.put("Biswajit",76);
		studentlist.put("Manajit",99);
		studentlist.put("Sandeep",66);
		studentlist.put("Ashis",88);
		System.out.println(studentlist);
		System.out.println("The Highest grade of student  "+Student.avarageGrade(studentlist));
	}

}
