//Write a Java method that takes a map of student names and their corresponding grades in different 
//subjects as parameters and returns a new map with the average grade for each student.



package com.Map;
import java.util.*;
class CalculateAvarage
{
	public static Map<String,Double> avargaeOfStudent(Map<String,int[]> student)
	{
		Map<String,Double> grades=new HashMap<>();
			for(String name:student.keySet())
			{
				int sum=0;
				int count=0;
				int []grade=student.get(name);
				for(int grad:grade)
				{
					sum+=grad;
					count++;
					
				}
				double avarage=sum/count;
				grades.put(name, avarage);
			}
		System.out.println(grades);
		
		
		
		return grades;
		
	}
}


public class StudentAvarage {
	public static void main(String[] args) 
	{
		Map<String,int[]> studentmarkes=new HashMap<>();
		studentmarkes.put("Smruti",new int[] {40,50,60});
		studentmarkes.put("Sandeep",new int[] {60,70,60});
		CalculateAvarage.avargaeOfStudent(studentmarkes);
		
		
		
	}
	

}
