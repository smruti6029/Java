//Implement a program to sort a queue of integers in ascending order without using any additional 
//data structures.
//Input: A queue of integers.
//Output: The same queue with integers sorted in ascending order.



package com.Queue;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Iterator;


public class UsingComparatorAcendingOrder {
	public static void sortQueue(Queue<Integer> elements)
	{
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.naturalOrder());
		
		priorityQueue.addAll(elements);
//		System.out.println(priorityQueue);
		elements.clear();
		elements.addAll(priorityQueue);
//		Iterator<Integer> iterator=elements.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		System.out.println(elements);
	}
	public static void main(String[] args) 
	{
	Queue<Integer> elements=new LinkedList<>();
	
	elements.offer(5);
	elements.offer(8);
	elements.offer(1);
	elements.offer(10);
	elements.offer(44);
	elements.offer(54);
	elements.offer(66);
	System.out.println(elements);
	
	sortQueue(elements);
		
	}

}
