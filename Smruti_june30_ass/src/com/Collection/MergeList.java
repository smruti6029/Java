package com.Collection;
import java.util.*;

public class MergeList {
	public static void main(String[]args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(89);
		List<Integer> list1=new ArrayList<>();
		list1.add(55);
		list.add(22);
		list.addAll(list1);
		System.out.println(list);
		
		
	}

}
