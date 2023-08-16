//Create two map with name as todayMap<string,arrayList> and weeklyMap<string, arrayList>.
//Basically the key contains the vehicle number and the arrayList contains the speed with 
//respective vehicles. 
//i) find the vehicle number and speed where the speed is greater than the provided speed 
//(through scanner class) and print it.
//ii) find the common speed of the vehicles in both the maps and print the speed with vehicle number.




package com.SpeedCheckVechile;
import java.util.*;
import java.util.Map.Entry;
class CalculateAvarage
{
			public static void calculateAvarage(Map<String,List<Integer>> todayMap)
			{
				Scanner sc=new Scanner(System.in);
				int input=100;
				System.out.println("Enter The Speed");
				try {
				input=sc.nextInt();
				}
				catch(Exception e )
				{
					System.out.println("enter a number");
				}
				Map<String,List<Integer>> todayMap1 =new HashMap<>();
				for(String number:todayMap.keySet())
				{
					List<Integer> list= todayMap.get(number);
					ArrayList<Integer> list2=new ArrayList<>();
					for(Integer x:list)
					{
					
						if(x>=input)
						{
							list2.add(x);
						}
					}
					todayMap1.put(number, list2);
				}
				System.out.println(todayMap1);
				
			}
	
			public static void commonSpeed(Map<String,List<Integer>> todayMap,Map<String,List<Integer>> weeklyMap)
			{
				Map<String,ArrayList<Integer>> common=new HashMap<>();
				for(String Number:todayMap.keySet())
				{
					List<Integer> list=todayMap.get(Number);
					for(String Number2:weeklyMap.keySet())
					{
						List<Integer> list2=weeklyMap.get(Number2);
						ArrayList<Integer> array=new ArrayList<>();
						for(Integer x:list)
						{
							for(Integer y:list2)
							{
								if(x==y)
								{
//									
									if(y>=70)
									{
									array.add(y);
									}
									
								}
							}
						}//for
						common.put(Number,array);
						
					}
				}
				//System.out.println("The commun speed  "+common);
				for(Map.Entry<String,ArrayList<Integer>>  m1: common.entrySet())
				{
					System.out.println("Total speed common  "+m1.getValue()+m1.getKey());
				}
				
			}
}



public class VechileSpeeedAvg {
	public static void main(String[] args) 
	{
		List<Integer> speed = Arrays.asList(100,120,80,70,95);
		List<Integer> speed1 = Arrays.asList(100,110,80,70,95);
		List<Integer> speed2 =Arrays.asList(100,105,80,70,95);
		List<Integer> speed3 = Arrays.asList(100,60,80,70,95);
		List<Integer> speed4 = Arrays.asList(100,50,80,70,95);
		Map<String,List<Integer>> todayMap =new HashMap<>();
		todayMap.put("OD-33-AX-2023", speed);
		todayMap.put("OD-33-AX-2024", speed1);
		todayMap.put("OD-33-AX-2025", speed2);
		todayMap.put("OD-33-AX-2026", speed3);
		todayMap.put("OD-33-AX-2027", speed4);
		Map<String,List<Integer>> weeklyMap =new HashMap<>();
		List<Integer> speed5 =Arrays.asList(30,40,81,70,95);
		List<Integer> speed6 = Arrays.asList(60,65,81,70,95);
		List<Integer> speed7 = Arrays.asList(100,50,81,70,95);
		weeklyMap.put("OD-33-AX-2023", speed);
		weeklyMap.put("OD-33-AX-2024", speed1);
		weeklyMap.put("OD-33-AX-2025", speed5);
		weeklyMap.put("OD-33-AX-2026", speed6);
		weeklyMap.put("OD-33-AX-2027", speed7);
		
		CalculateAvarage.calculateAvarage(todayMap);
		CalculateAvarage.commonSpeed(todayMap,weeklyMap);
				

	}

}
