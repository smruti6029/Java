package com.ArrayList;
import java.util.*;


public class FindOccurance {

		public static void main(String[] args) throws Exception {
			
			List<String> list = new ArrayList<>();
			Set<String> list2=new HashSet<>();
			
		    list.add("aaa");
		    list.add("aaa");
		    list.add("Raja");
		    list.add("Raja");
		    
		   
		    
		    int len=list.size();
		    for(int i = 0; i <list.size();i++) {
		    	
		     for(int j = i+1 ;j <len-1 ;j++) {
		    	 
		    	 if(list.contains(j)) 
		    	 {
		    		 list.remove(j);
		    		 
		    		 
		    	 }
		    	 else
		    	 {
		    		 list2.add(list.get(j));
		    	 }
		    	}
		     }
		    System.out.println(list2);
		    
		    
		    	
		    }
		    
			
			
		    }




