//Write a program that creates an array of wrapper class objects (Integer, Double, etc.),
//assigns values to them, and calculates the sum of the array elements.

package com.Wrapper;
import java.util.*;
class ArrayImplimentClass
{
	void integerSum()
	{
	Scanner sc =new Scanner(System.in);
	int sum=0;
	Integer[] num=new Integer[5];
	for(int i=0;i<5;i++)
	{
		System.out.println("enter integer number");
		num[i]=sc.nextInt();
	}
	for(int i=0;i<5;i++)
	{
		sum+=num[i];
		
		
	}
	System.out.println(sum);
	
    }
	void doubleSum()
	{
		Scanner sc =new Scanner(System.in);
		double sum=0;
		Double[] num=new Double[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("enter double number");
			num[i]=sc.nextDouble();
		}
		for(int i=0;i<5;i++)
		{
			sum+=num[i];
			
			
		}
		System.out.println(sum);
	}
		
	}


public class WrapperClass {

	public static void main(String[] args) {
		ArrayImplimentClass obj=new ArrayImplimentClass();
		obj.integerSum();
		obj.doubleSum();
		
	}

}
