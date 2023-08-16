//Given a map of words and their meanings, write a Java method to find all the words that have 
//a meaning starting with a specified prefix.


package com.Map;
import java.util.*;
class PrefixwordCount
{
	  public static void wordsPrefix(Map<String,String> words,String prefix)
	  {
		  for(String word:words.keySet())
		  {
			  if(words.get(word).startsWith(prefix))
			  {
				  System.out.println(word+"    "
				  		+ ""+words.get(word));
			  }
		  }
	  }
}

public class PrefixWord {
	public static void main(String[] args) 
	{
		Map<String,String> words=new HashMap<>();
		words.put("The 1 Student", "Smruti");
		words.put("The 2 Student", "Sandeep");
		words.put("The 3 Student", "Manajit");
		System.out.println("The Prefix start with S");
		PrefixwordCount.wordsPrefix(words,"S");
		
	}
	
	

}
