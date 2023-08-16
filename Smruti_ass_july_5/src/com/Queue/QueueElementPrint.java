//Write a Java program to simulate a printing queue. Implement a function that takes a queue of print jobs as input 
//and prints them in the order they were added to the queue.
//Input: A queue of print jobs, where each job is represented by a string.
//Output: The print jobs printed in the order they were added.
//


package com.Queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class QueueElementPrint {

	public static void main(String[] args) {
		Queue<String> elements=new LinkedList<>();
		elements.offer("Day Start");
		elements.offer("good Morning");
		elements.offer("Good Day");
		elements.offer("Day End");
		
		
		
		Iterator<String> iterator=elements.iterator();
		while(iterator.hasNext())
		{
//			int element=iterator.next();
			System.out.println(iterator.next());
		}
		
		
	}

}
