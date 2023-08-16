package com.Collection;
import java.util.*;

public class RemoveAllDuplicateElement {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(33);
		list.add(32);
		list.add(22);
		list.add(77);
		list.add(33);
		HashSet<Integer> unique=new HashSet(list);
		List<Integer> uniqueList = new ArrayList<>(unique);
		System.out.println(uniqueList);

	}

}
