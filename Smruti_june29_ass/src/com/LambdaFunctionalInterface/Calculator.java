//Create a functional interface called MathOperation with a method calculate(int a, int b) 
//that returns an integer. Write a lambda expression that implements the MathOperation interface 
//to calculate the product of two numbers.

package com.LambdaFunctionalInterface;
import java.util.*;
@FunctionalInterface
interface MathOpreation
{
	int product(int a,int b);
}

public class Calculator {

	public static void main(String[] args) {
		MathOpreation mo=(a,b)->a*b;
		

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBER PRODUCT");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(mo.product(a,b));
	}

}
