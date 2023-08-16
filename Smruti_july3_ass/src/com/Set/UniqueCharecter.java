//Write a Java method that takes a set of strings and returns a new
//set containing the unique characters present in all the strings of the input set


package com.Set;
import java.util.*;

public class UniqueCharecter {

	
	
	
	public static LinkedHashSet<Character> uniqueString(LinkedHashSet<String> str)
	{
		LinkedHashSet<Character> str3=new LinkedHashSet<>();
		
		
		for(String str1:str)
		{
			char[] ch=str1.toCharArray();
			for (Character c : ch) {
				if(c>='A' && c<='Z' || c>='a' && c<='z')
				{
					
		        str3.add(c);
				}
				
		        
			}
			
			
			
			
		}
		return str3;
	}
	public static void main(String[] args) {
		LinkedHashSet<String> str=new LinkedHashSet<>();
		LinkedHashSet<Character> str3=new LinkedHashSet<>();
		str.add("numberr");
		str.add("Master ");
		System.out.println(uniqueString(str));
		
		
		

	}

}
