//Given a list of integers, find the second smallest element using a collection.

package com.Collection;
import java.util.*;
//class Smallest
//{
//	public int minumumNumber(List<Integer> list)
//	{
//		int min=Integer.MAX_VALUE;
//		for(int i:list)
//		{
//			if(min>i)
//			{
//				min=i;
//				}
//			
//			}
//		
//		return min;
//		}
//	public int secoundSmallest(List<Integer> list)
//	{
//		int firstsmallest=minumumNumber(list);
//		int min=Integer.MAX_VALUE;
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//			if(list.get(i)>firstsmallest && min>list.get(i))
//			{
//				
//				min=list.get(i);
//				
//			}
//		}
//		System.out.println(min);
//		return min;
//		
//	}
//}


class Smallest
{
	public int secoundSmallest(List<Integer> list)
	{
		Collections.sort(list);
		System.out.println(list);
		
	return list.get(1);
	}
	
}
public class SecoundSmallest {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(6);
	
		Smallest smallest=new Smallest();
		System.out.println(smallest.secoundSmallest(list));

	}

} 	 	 
