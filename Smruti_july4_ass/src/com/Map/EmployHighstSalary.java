//Given a map of employee names and their corresponding salaries, 
//write a Java method to find the employee with the highest salary.

package com.Map;
import java.util.*;

public class EmployHighstSalary {
	public static void main(String[] args) {
		Map<Integer ,String> set=new HashMap<>();
		set.put(30000,"Sandeep");
		set.put(50000,"Biswajit");
		set.put(40000,"Smruti");
		set.put(60000,"Ashis");
		set.put(30000,"Manajit");
		System.out.println(set);
		int salary=Integer.MIN_VALUE;
		for(int x:set.keySet())
		{
			if(x>salary)
			{
				salary=x;
			}
		
			
		}
		System.out.println(set.get(salary)+  " "   +salary);
		
	}

}
