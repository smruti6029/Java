//Write a program that uses lambda expressions to calculate the square root of each number 
//in a list of doubles. The program should take a list of doubles as input, use a 
//lambda expression to calculate the square root of each number, and display the results as 
//the output.


package com.LambdaFunctionalInterface;
import java.util.*;
@FunctionalInterface
interface DoubleNumber
{
	void square(double[] num,int size);
	
}

public class ShowDoubleSqure {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		DoubleNumber DN=(double[] num,int size)->{
		int i;
		double[] squre=new double[size];
		for(i=0;i<size;i++)
		{
			squre[i]=Math.sqrt(num[i]);
			
		}
		for(i=-0;i<size;i++)
		{
			System.out.println(squre[i]);
		}
		};
		
		System.out.println("Enter Size");
		int size=obj.nextInt();
		double[] arrr=new double[size];
		for(int j=0;j<size;j++)
		{
			System.out.println("enter double element");
			arrr[j]=obj.nextDouble();
		}
		DN.square(arrr, size);
		
	}
	
}
