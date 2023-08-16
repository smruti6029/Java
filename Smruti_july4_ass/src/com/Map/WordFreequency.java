//Write a Java method that takes a list of words calculates their 
//frequencies and stores them into a map frequence as key and words as value 
//and sorts the map by descending order.


package com.Map;
import java.util.*;
import java.util.Map.Entry;
class Frequency
{
	public static void frequence(ArrayList<String> word)
	{
		Map<ArrayList<String>,Integer> frequenceset=new HashMap<>();
		Map<String,Integer>  word1=convertListToHashMap(word);
		List<Integer> list=new ArrayList<>();
		for(String str:word1.keySet())
		{
			list.add(word1.get(str));
			
		}
		list.sort(Collections.reverseOrder());
//		System.out.println(list);
		for(Integer value:list)
		{
			System.out.println(getKeyByValue(word1, value));
		}
	}

	private static Entry<String, Integer> getKeyByValue(Map<String, Integer> word1, Integer value) {
			
	
	        for (Map.Entry<String, Integer> entry : word1.entrySet()) {
	            if (value.equals(entry.getValue())) {
	                return entry;
	            }
		
	}
	        return null;
			
	}

	private static Map<String,Integer> convertListToHashMap(ArrayList<String> word)
	{
		LinkedHashMap<String,Integer>  word2=new LinkedHashMap<>();
		for(String x:word)
		{
			if(word2.containsKey(x))
			{
				word2.put(x,word2.get(x)+1);
				
			}
			else
			{
				word2.put(x,1);
			}
		}
		
		System.out.println(word2);
		return word2;
	}
	}



public class WordFreequency {
	public static void main(String[] args) {
		ArrayList<String> wordlist=new ArrayList<>();
		wordlist.add("apple");
		wordlist.add("Banana");
		wordlist.add("Banana");
		wordlist.add("Banana");
		wordlist.add("strawberry");
		wordlist.add("strawberry");
		
		
		Frequency.frequence(wordlist);
		
		
		
	}
	
	
	

}
