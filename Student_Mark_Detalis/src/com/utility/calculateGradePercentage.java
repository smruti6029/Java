package com.utility;

import java.util.ArrayList;
import com.constantClass.*;
import java.util.HashMap;
import java.util.Map;

public class calculateGradePercentage 
{

	public static HashMap<String, Double> calculateGradePercentage(Map<String, ArrayList<Double>> studentMarkes) 
	{		ArrayList<Double> marks=new ArrayList<>();
			HashMap<String, Double> gradepercentage =new HashMap<>();
		for(Map.Entry<String,ArrayList<Double>> set:studentMarkes.entrySet())
				{
			marks=(set.getValue());
	
				}
		double mark=0.0;
		for(Double x:marks)
		{
			
			mark+=x;
		}
		
		mark/=6;
		gradepercentage.put(CalculateGrade.getGrade(mark),mark);

		return gradepercentage;
	}

	
	 
}
