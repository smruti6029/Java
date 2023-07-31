package com.StudentService;

import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.Dao.StudentMarkDao;
import com.constantClass.CalculateGrade;

public class CountStudentEachGrade {

	public static void CountStudentEachGrade() throws ClassNotFoundException, Exception 
	{
		Map<String,Integer> gradecounts =new HashMap<>();
		
		ArrayList<Double>  percentage=new ArrayList<>();
		String name="";
		ResultSet set=StudentMarkDao.GetAllValue();
		if(set!=null)
		{
			 while (set.next()) {
		            double sum = 0.0;
		            int count = 0;

		            sum += set.getDouble("english");
		            sum += set.getDouble("math");
		            sum += set.getDouble("bio");
		            sum += set.getDouble("it");
		            sum += set.getDouble("chem");
		            sum += set.getDouble("phy");
		            
		            count += 6; 

		            double avg = sum / count;
		            String grade =CalculateGrade.getGrade(avg);

		            gradecounts.put(grade, gradecounts.getOrDefault(grade, 0) + 1);
		        }
		System.out.println(gradecounts);
		
		
		}
		
		
		
		
	}
	

}

