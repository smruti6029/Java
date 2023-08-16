// Implement a program to sort a queue of integers in ascending order without using any 
// additional data structures.

package com.Queue;
import java.util.*;


public class QueueAcendingOrder {
	public static void decendingOrder(PriorityQueue<Integer> elements)
	{
//		Iterator<Integer> iterator=elements.iterator();
//		while(iterator.hasNext())
//		{
//			int element=elements.poll();
//			System.out.println(elements.poll());
//			elements.offer(element);
//			System.out.println(elements);
//			break;
//		}
		 int n = elements.size();

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                int first = elements.poll();
	                int second = elements.peek();

	                if (first > second) {
	                   elements.offer(second); 
	                   elements.poll(); //elements.poll();
	                }

	                elements.offer(first);
	            }
	            	        }
	        System.out.println(elements);
		
	}
	public static void main(String[] args) {
		PriorityQueue<Integer> elements=new PriorityQueue<>();
		elements.offer(5);
		elements.offer(8);
		elements.offer(1);
		elements.offer(10);
		elements.offer(44);
		elements.offer(54);
		elements.offer(66);
		
		System.out.println(elements);
		decendingOrder(elements);
		
	}

}
