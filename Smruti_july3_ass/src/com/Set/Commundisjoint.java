//Write a Java method to check if two sets, set1 and set2, are disjoint. (Two sets are disjoint if they have no elements in common

package com.Set;
import java.util.*;

public class Commundisjoint {
	
	public static boolean checkDisjoint(HashSet<Integer> set1,HashSet<Integer> set2)
	{
		for(Integer i:set2)
		{
			if(set1.contains(i))
			{
				return true;
			}
			else
			{
				break;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		set1.add(55);
		set1.add(22);
//		set1.add(666);
		set2.add(55);
		set2.add(22);
		set2.add(66);
		if(!checkDisjoint(set1,set2))
		{
			System.out.println("2 sets are  DISJOINT");
		}
		}
		
			
		

	}


