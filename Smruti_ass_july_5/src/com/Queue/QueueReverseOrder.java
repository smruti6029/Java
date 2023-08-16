//Implement a program to reverse the order of elements in a queue.
//Input: A queue of integers.
//Output: The same queue with elements reversed.


package com.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class ReverseElement
{
	public static Queue<Integer> reverseOrder(Queue<Integer> integers)
	{
		ArrayList<Integer> arrayList = new ArrayList<>(integers);
		Collections.reverse(arrayList);
		
		Queue<Integer> integer=new LinkedList(arrayList);
		
		return integer;
	}
}

public class QueueReverseOrder {

	public static void main(String[] args) {
		Queue<Integer> integers=new LinkedList();
		integers.offer(45);
		integers.offer(42);
		integers.offer(66);
		integers.offer(29);
		integers.offer(60);
		System.out.println("BEFORE REVERSE QUEUE "+integers);
		System.out.println("AFTER REVERSE"+ReverseElement.reverseOrder(integers));

	}

}
