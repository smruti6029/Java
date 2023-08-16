//Write a Java method that takes two sets, set1 and set2, as parameters and returns a new 
//set that contains the elements present in set1 but not in set2

package com.Set;
import java.util.*;
public class UniqueElement
{
	
	public static HashSet<Integer> uniQue(Set<Integer> set1,Set<Integer> set2)
	{
		Set<Integer> mergeset=new HashSet<>();
		set1.removeAll(set2);
//		for(Integer n:set1)
//		{
//			
//			if(!set2.contains(n))
//			{
//				mergeset.add(n);
//			}
//		}
//		return (HashSet<Integer>) mergeset;
		return (HashSet<Integer>) set1;
	}
	


 

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		set1.add(227);
		set1.add(33);
		set1.add(66);
		set1.add(55);
		set2.add(22);
		set2.add(33);
		set2.add(66);
		set2.add(55);
		System.out.println(uniQue(set1,set2));
		
	}
}


