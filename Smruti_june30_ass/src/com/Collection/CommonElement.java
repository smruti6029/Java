//Given two lists of integers, find the common elements between them and display the result

package com.Collection;
import java.util.*;

public class CommonElement {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(66);
		List<Integer> list1=new ArrayList<>();
		list1.add(50);
		list.add(60);
		list.add(12);
		list1.retainAll(list);
		System.out.println(list1);
		

	}

}
