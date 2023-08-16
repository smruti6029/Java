//Given a map of product names and their corresponding prices,
//write a Java method to calculate the total cost of all the products 
//in the map, print the output as like invoice.


package com.Map;
import java.util.*;
class PriceTag
{
	   public static void pruductInvoice(Map<String,Integer> set)
	   {
		   int totalcost=0;
		   for(String x:set.keySet())
		   {
			   totalcost+=set.get(x);
		 }
		   for(String x:set.keySet())
		   {
			   System.out.println("The Value of--- "+x +"Is "+set.get(x));
		   }
		   
		   System.out.println("The total Cost----"+totalcost);
	   }
}


public class PruductPrice {
				public static void main(String[] args) {
					Map<String,Integer> set=new HashMap<>();
					set.put("PizzA", 120);
					set.put("Burger", 100);
					set.put("Cold Drinks", 60);
					set.put("Sweeet",40);
					set.put("Ice Cream", 200);
					PriceTag.pruductInvoice(set);
					
					
}
}
