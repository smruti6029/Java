//Write a Java method that takes a map of city names and their corresponding populations as 
//parameters and returns the name of the city with the highest population.


package com.Map;
import java.util.*;
class CityPopulationCalculation
{
	public  static String highestPopulation(Map<String,Integer> cityes)
	{
		int highest=Integer.MIN_VALUE;
		String name=null;
		for(String city:cityes.keySet())
		{
			if(cityes.get(city)>highest)
			{
				highest=cityes.get(city);
				name=city;
				
			}
		}
		return name;
	}
}

public class HighestPopulationCity {
	public static void main(String[] args) 
	{
		Map<String,Integer> cityes=new HashMap<>();
		cityes.put("Cuttack", 8900000);
		cityes.put("BBSR", 7000000);
		cityes.put("Kalahandi", 3300000);
		cityes.put("Puri", 5900000);
		System.out.println("The Highest Population In "+CityPopulationCalculation.highestPopulation(cityes));
	}

}

