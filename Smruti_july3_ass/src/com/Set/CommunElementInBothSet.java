//Given two sets of integers, write a Java method to find the intersection of the two sets 
//(i.e., the elements present in both sets).

package com.Set;

import java.util.*;

public class CommunElementInBothSet {
	public static HashSet<Integer> communElement(HashSet<Integer> set1,HashSet<Integer> set2)
	{
		HashSet<Integer> set3=new HashSet<Integer>();
		for(Integer i:set2)
		{
			if(set1.contains(i))
			{
				set3.add(i);
			}
			
			
		}
		return set3;
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
		System.out.println("the Commun Element are"+communElement(set1,set2));
		

	

}
}
