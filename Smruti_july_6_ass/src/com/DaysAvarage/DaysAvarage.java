//Creat a map with name as weekmap. Basically the key contains the day of the week. 
//After that push some speed data on the day basics to the map. 
//i) iterate over the map and find the average speed of that vehicle.
//

package com.DaysAvarage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
class AvarageVechile
{
			public static void avarageVechile(HashMap<String,ArrayList<Integer>> days)
			{
				HashMap<String,Integer> avaragespeed=new HashMap<>();
				for(String day:days.keySet())
				{
					ArrayList<Integer> arr=days.get(day);
					int sum=0;
					double avg;
					for(Integer x:arr)
					{
						sum+=x;
						
					}
					
					avaragespeed.put(day, sum);
				}
				System.out.println("0D-05-2023");
				System.out.println("The Final Speed Avarage of Bike No 0D-05-2023");
				System.out.println(avaragespeed);
				System.out.println("The Total Avarage Speed "+totalavarageSpeed(avaragespeed));
				totalavarageSpeed(avaragespeed);
				
				
			}
			public static double totalavarageSpeed(HashMap<String,Integer> avaragespeed)
			{
				double avg,sum=0;
				
				for(String day:avaragespeed.keySet())
				{
					sum+=avaragespeed.get(day);	
				}
				return sum/7;
			}
			
	
}




public class DaysAvarage {
	public static void main(String[] args) 
	{
		HashMap<String,ArrayList<Integer>> days=new HashMap<>();
		ArrayList<Integer> integers= new ArrayList<>();
		integers.addAll((Arrays.asList(80, 90, 100, 110, 130)));
		ArrayList<Integer> integers1= new ArrayList<>();
		integers1.addAll((Arrays.asList(80, 88, 100, 110, 130)));
		ArrayList<Integer> integers2= new ArrayList<>();
		integers2.addAll((Arrays.asList(80, 77, 100, 121, 130)));
		ArrayList<Integer> integers3= new ArrayList<>();
		integers3.addAll((Arrays.asList(80, 90, 100, 111, 130)));
		ArrayList<Integer> integers4= new ArrayList<>();
		integers4.addAll((Arrays.asList(80, 90, 97, 110, 130)));
		ArrayList<Integer> integers5= new ArrayList<>();
		integers5.addAll((Arrays.asList(80, 90, 95, 110, 120)));
		ArrayList<Integer> integers6= new ArrayList<>();
		integers6.addAll((Arrays.asList(80, 90, 95, 105, 110)));
		

		
		
		days.put("Monday", integers);
		days.put("Tuesday", integers1);
		days.put("Wednesday", integers2);
		days.put("Thusday", integers3);
		days.put("Friday", integers4);
		days.put("Saturday", integers5);
		days.put("Sunday", integers6);
		System.out.println(days);
		AvarageVechile.avarageVechile(days);
		
		
		
		
		
		
	}

}
