package com.Map;

import java.util.*;


public class StudentAvarageMark {
	public static void main(String[] args) 
	{
		Map<String,Map<String,Integer>> studentmarkes=new HashMap<>();
		Map<String,Integer> subjects=new HashMap<>();
		Map<String,Integer> subjects2=new HashMap<>();
		subjects.put("Math", 50);
		subjects.put("Science", 44);
		subjects.put("Physics", 60);
		subjects.put("Comuputer Network", 70);
		subjects.put("It", 50);
		
		studentmarkes.put("Smruti", subjects);
		subjects2.put("Math", 70);
		subjects2.put("Science", 90);
		subjects2.put("physics", 90);
		subjects2.put("Computer Network", 90);
		subjects2.put("It", 90);
		
		studentmarkes.put("Biswajit", subjects2);
		System.out.println(studentmarkes);
		Map<String,Integer> sub=new HashMap<>();
		Map<String,Double> totalstudentgrade=new HashMap<>();
		
		for(String x:studentmarkes.keySet())
		{
			int sum=0;
			int count=0;
			sub=studentmarkes.get(x);
			for(String y:sub.keySet())
			{
				sum+=sub.get(y);
				count++;
			}
			double grade=sum/count;
			totalstudentgrade.put(x, grade);
			
			
			System.out.println(totalstudentgrade);
		}
		
		
		
		
		
		
		
	}
	

}

