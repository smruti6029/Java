package com.Set;
import java.util.*;
class FindMinandMax
{
	public int min(HashSet<Integer> num)
	{
		int min=Integer.MAX_VALUE;
		for(Integer n:num)
		{
			if(n<min)
			{
				
				min=n;
			}
		}
		return min;
	}
	public int max(HashSet<Integer> num)
	{
		int max=Integer.MIN_VALUE;
		for(Integer n:num)
		{
			if(n>max)
			{
				
				max=n;
			}
		}
		return max;
	}
	
}

public class MaximumInSet {
	

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		FindMinandMax obj=new FindMinandMax();
		set.add(22);
		set.add(55);
		set.add(66);
		set.add(88);
		System.out.println("THE VALUE OF MIN "+obj.min(set));
		System.out.println("THE VALUE OF MAX "+obj.max(set));
		
		
		

	}

}
