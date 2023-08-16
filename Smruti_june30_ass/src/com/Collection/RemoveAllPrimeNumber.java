package com.Collection;
import java.util.*;
public class RemoveAllPrimeNumber {
	public static void main(String[]args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		for(int x:list)
		{
			if(x%2!=0)
			{
				System.out.println(x);
				
			}
		}
		System.out.println(list);
	}
}
