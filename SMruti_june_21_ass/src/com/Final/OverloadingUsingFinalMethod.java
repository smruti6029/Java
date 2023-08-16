//Write a program to showcase overloading of method with the use of final variables .

package com.Final;
import java.util.*;

class Demo12
{
	final int Discount=500;
	int phone()
	{
		return 15000-500;
	}
	int phone(int i)
	{
		return 20000-500;
	}
	
}

public class OverloadingUsingFinalMethod {

	public static void main(String[] args) {
		Demo12 obj=new Demo12();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1 for known oppo phone discount");
		System.out.println("enter 2 for known vivo phone discount");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("The oppo phone with discount"+obj.phone());
		}
		else if(num==2)
		{
			System.out.println("The vivo phone with discount"+obj.phone(0));
		}
		else
		{
			System.out.println("enter the right key");
		}

	}

}
