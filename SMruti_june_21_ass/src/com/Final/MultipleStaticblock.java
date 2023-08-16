package com.Final;
import java.util.*;


class MultipleStaticblock1
{
	static double  py;
	static
	{
		py=3.14;
	}
	double radius(int radius)
	{
		return py*(radius*radius);
	}
	
}


public class MultipleStaticblock {
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			MultipleStaticblock1 obj=new MultipleStaticblock1();
			System.out.println("Enter Circle Radius for Calculate area");
			int r=sc.nextInt();
			System.out.println("The area of circle "+ obj.radius(r));
			
		}
}
