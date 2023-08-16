//Question: Implement a program to find the largest element in a queue of integers without removing any elements 
//from the queue.
//Input: A queue of integers.
//Output: The largest element in the queue.

package com.Queue;
import java.util.*;

class LargestElement
{
	public static  int largestElement(Queue<Integer> integers)
	{
		int max=Integer.MIN_VALUE;
		
		for(Integer x:integers)
		{
			if(x>max)
			{
				max=x;
			}
			
		}
		
		return max;
		
	}
}

public class LargestElmentInQueue {

	public static void main(String[] args) 
	{
	Queue<Integer> integers=new LinkedList();
	integers.offer(45);
	integers.offer(42);
	integers.offer(66);
	integers.offer(29);
	integers.offer(60);
	System.out.println(integers);
	System.out.println("The Highest Element  "+LargestElement.largestElement(integers));
	
	System.out.println(integers);
	System.out.println();
	
	
	

	}

}
