//Given a map of characters and their corresponding frequencies in a string, 
//write a Java method to find the character(s) that occur(s) the most number of times.p

package com.Map;
import java.util.*;
import java.util.Map.Entry;
class Chahoccur
{
	public static void charOccur(Map<String,String> wordmap) 
	{
		int max=Integer.MIN_VALUE;
		for(String str:wordmap.keySet()) 
		{
			
			if(Integer.parseInt(wordmap.get(str))>max)
			{
				max=Integer.parseInt(wordmap.get(str));
		
			}
			}
		System.out.println(getKeyByValue(wordmap,max));
		
		
	}
	private static Entry<String,String> getKeyByValue(Map<String, String> word1, Integer valu) {
			String value=String.valueOf(valu);
		
		
        for (Map.Entry<String, String> entry : word1.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry;
            }
	
}
        return null;
		
}
}

public class CharecterOccur {
	public static void main(String[] args) 
	{
		Map<String,String> wordmap=new HashMap<>();
		wordmap.put("A","12");
		wordmap.put("Z","11");
		wordmap.put("C","19");
		wordmap.put("D","22");
		wordmap.put("E","100");
		wordmap.put("N","33");
		
		Chahoccur.charOccur(wordmap);
		
	}

	
}
