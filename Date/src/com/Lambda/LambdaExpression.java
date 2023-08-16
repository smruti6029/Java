package com.Lambda;

import java.util.*;
import java.util.stream.Stream;

@FunctionalInterface
interface show
{
	void show();
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		show a=() -> System.out.println("Welcome World");
		System.out.println("hello world");
		a.show();
			var	 arr=Arrays.asList(1,2,3,4,4);
			
//			arr.forEach( i-> System.out.println(i));
//			Stream<Integer> number=arr.stream(); 
//			number.forEach(n -> System.out.println(n));
			
			arr.stream()
			.filter(n-> n%2!=0)
			.sorted()
			.map(n ->n*2).
			forEach(n -> System.out.println(n));
		
			
		
	}
	
	
	
	
}
