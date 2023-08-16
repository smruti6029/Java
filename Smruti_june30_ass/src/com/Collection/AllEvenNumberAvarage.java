package com.Collection;
import java.util.*;

public class AllEvenNumberAvarage {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(6);
		list.add(7);
		list.add(66);
		list.add(44);
		int count=0;
		int sum=0;
		for(int x:list)
		{
			if(x%2==0)
			{
				sum+=x;
				count++;
			}
		}
		System.out.println("The AVarage of even number = "+(sum/count));
		

	}

}
