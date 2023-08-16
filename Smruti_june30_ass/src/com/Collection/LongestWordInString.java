package com.Collection;
import java.util.*;

public class LongestWordInString {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Rapid");
		list.add("Soft");
		list.add("RapidSoft");
		String longestword="";
		for(String word:list)
		{
			if(word.length()>longestword.length())
			{
				longestword=word;
			}
		}
		System.out.println(longestword);
		

	}

}
