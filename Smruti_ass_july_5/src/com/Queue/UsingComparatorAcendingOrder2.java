package com.Queue;
import java.util.*;

class MyComparator implements Comparator
{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		if((Integer) obj1 < (Integer)obj2)
		{
			return 1;
		}
		else if((Integer) obj1 > (Integer)obj2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}
public class UsingComparatorAcendingOrder2 {
	public static void main(String[] args) {
		Queue<Integer> listofint=new PriorityQueue<>(new MyComparator());
		listofint.offer(2);
		listofint.offer(5);
		listofint.offer(4);
		listofint.offer(3);
		listofint.offer(6);
		System.out.println(listofint);
		
		
	}

}
