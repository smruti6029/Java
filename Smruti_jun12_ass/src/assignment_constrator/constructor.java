package assignment_constrator;

import java.util.Scanner;

//import java.utli.*;
class demo
{
	demo()
	{
		System.out.println("Total floor 5  . Room number starting from 1 and ending 499");
	}
	demo(int a)
	{ 
		int i=0;
		if(a>=1 && a<100)
		{
			System.out.println("your destination in first floor");
		}
		else if(a>=100 && a<200)
		{
			System.out.println("your destination in 2nd floor");
		}
		else if(a>=200 && a<300)
		{
			System.out.println("your destination in 3rd floor");
		}
		else if(a>=300 && a<400)
		{
			System.out.println("your destination in 4th floor");
		}
		else if(a>=400 && a<500)
		{
			System.out.println("your destination in 5th floor");
		}
		else
		{
			if(a==0)
			{
				System.out.println("now you are in ug floor");
			}
			else
			{
				System.out.println("eneter valid room");
			}
		}
		
	}
}
class constructor {

	public static void main(String[] args) 
	{
		int number;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter room number");
		number=obj.nextInt();
		demo obj2=new demo(number);

	}

}
