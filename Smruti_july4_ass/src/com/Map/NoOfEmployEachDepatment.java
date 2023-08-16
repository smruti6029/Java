// Given a map of employee names and their corresponding departments, 
// write a Java method to find the number of employees in each department.

package com.Map;
import java.util.*;
class Employ
{
	
	public static Map<String,Integer> countEmployeDeapatment(Map<String,String> employ)
	{
		Map<String, Integer> departmentCounts = new HashMap<>();
		
		for(String key:employ.keySet())
		{
			String department = employ.get(key);	
			if(departmentCounts.containsKey(department))
			{
				int count = departmentCounts.get(department);
				departmentCounts.put(department, count+1);
			}
			else
			{
				departmentCounts.put(department, 1);
			}
		}
		
		return departmentCounts;
	}
}

public class NoOfEmployEachDepatment {

	public static void main(String[] args) {
		Map<String,String> employ=new HashMap<>();
		employ.put("Smruti", "IT");
		employ.put("Ashis", "CSE");
		employ.put("Manajit", "IT");
		employ.put("Biswajit", "CSE");
		employ.put("Biswa", "IT");
		
		Map<String,Integer> departmentcount=Employ.countEmployeDeapatment(employ);
		
		for(String x:departmentcount.keySet())
		{
			System.out.println("The No of Employes Of each department  "+x+"  "+departmentcount.get(x));
		}

	}

}
