//Given a list of strings, remove all elements that start with a vowel and display the modified list.

package com.Collection;
import java.util.*;

class RemoveVowelElement
{
	
	public static boolean checkVowel(String string)
	{
		
		List<Character> vowel=new ArrayList<>();
		vowel.add('a');
		
		
			if(vowel.contains(string.charAt(0)))
			{
				return false;
			}
		
		return true;
	}
		
	


	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Mass");
		list.add("Raja");
		list.add("apple");
		list.add("Orrange");
		
		for(String str:list)
		{
			if(checkVowel(str))
			{
				System.out.println(str);
				
			}
		}

		

	}

	

}
