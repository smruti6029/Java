//Create a final class called "MathUtils" with a method "addNumbers(int a, int b)" 
//that adds two numbers and returns the result. Implement a program to demonstrate the 
//use of a final class by calling
//the "addNumbers()" method.


package Smruti_june16;
import java.util.Scanner;
final class MathUtils
{
	 int addNumber(int a,int b)
	{
		return a+b;
	}
}


public class using_final_keyword {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("enter 2 number");
		a=sc.nextInt();
		b=sc.nextInt();
		MathUtils obj=new MathUtils();
		System.out.println("the add of two number :="+obj.addNumber(a,b));
		
		
	}
}
