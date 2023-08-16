package com.Collection;
import java.util.*;

public class SortingAcendingOrder {
	public static void main(String [] args)
	{
		List<String> list=new ArrayList<>();
		
		list.add("Smamama");
		list.add("Vivo");
		list.add("oppo");
		list.add("Samsung");
		 Collections.sort(list, Comparator.comparingInt(String::length));
		 System.out.println(list);
	}

}
