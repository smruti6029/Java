//Given a list of strings, use lambda expressions to concatenate all the strings and
//return the final result.(provide the string value in run time using scanner class)

package com.LambdaFunctionalInterface;

import java.util.*;



@FunctionalInterface
interface StringConcat2
{
	void conCat(String[] a);
}

public class StringConcat {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i;
		System.out.print("Enter Size");
		
		int size=sc.nextInt();
		String arr[] = new String[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
	StringConcat2 SC=(String[] a)->{
		String concat="";
		int j;
		for( j=0;j<size;j++)
		{
			concat+=a[j]+" ";
		}
		System.out.println(concat);
	};
	SC.conCat(arr);
	
	
}
}
