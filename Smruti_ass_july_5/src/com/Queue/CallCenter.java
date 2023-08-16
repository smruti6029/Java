//Write a Java program to simulate a call center. Implement a function that takes a queue of 
//customer calls and processes them in a fair manner, where each customer is served in a round-robin
//fashion.
//Input: A queue of customer calls, where each call is represented by a string.


package com.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
class  CustumerCall
{
	public static void CustumerCalls(PriorityQueue<String> listofcustumer)
	{
		Iterator<String> iterator =listofcustumer.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
}

public class CallCenter {
	
	public static void main(String[] args) 
	{
		PriorityQueue<String> listofcustumer=new PriorityQueue<>();
		listofcustumer.offer("Amazon Smruti");
		listofcustumer.offer("Biswajit");
		listofcustumer.offer("Manajit");
		listofcustumer.offer("Ashis");
		listofcustumer.offer("Amazon Sandeep");
		CustumerCall.CustumerCalls(listofcustumer);
		
		
	}

}
