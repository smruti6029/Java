package com.entrysetuse;
import java.util.*;


class VechileSpeeedAvg
{
	
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
											array.add(y);
											
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
				
				
				
	public class EntrySetExample  {
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
				List<Integer> speed7 = Arrays.asList(10,50,81,70,95);
				weeklyMap.put("OD-33-AX-2023", speed);
				weeklyMap.put("OD-33-AX-2024", speed1);
				weeklyMap.put("OD-33-AX-2025", speed5);
				weeklyMap.put("OD-33-AX-2026", speed6);
				weeklyMap.put("OD-33-AX-2027", speed7);
				
				//CalculateAvarage.calculateAvarage(todayMap);
				VechileSpeeedAvg.commonSpeed(todayMap,weeklyMap);
						
				
				}
				
				}
				
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) 
//	{
//		ArrayList<Integer> array=new ArrayList<>();
//		Map <String,ArrayList<Integer>> set=new HashMap<>();
//		set.put("Number1", new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
//		set.put("Number2", new ArrayList<>(Arrays.asList(1, 3, 7, 4)));
//		System.out.println(set);
//		for(Map.Entry<String,ArrayList<Integer>> m1:set.entrySet())
//		{
//			System.out.println(m1.getKey());
//			array.addAll(m1.getValue());
////			System.out.println(array);
//		}
//		System.out.println(array);
//		
//		set.forEach((Key,Value)->{
//			System.out.println(Key+Value);
//			
//		});
//		
//		
//	}
//	
//	
//
//}                                
