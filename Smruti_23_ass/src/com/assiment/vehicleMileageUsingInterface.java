package com.assiment;
import java.util.*;

interface Vehicle
{
	void checkMileage(int km,int liter,double hour);
}

class Honda implements Vehicle
{
   public  void checkMileage(int km,int liter,double hour)
	{
    	
    	System.out.println("The Running Mileage of Honda is :"+(km/liter)+"KM");
    	System.out.println("The Engine Hour  Mileage of Honda is :"+(km/(int)hour)+"KM");
    	System.out.println("The Actual Mileage of Honda is :"+((km/liter+km/(int)hour)/2)+"KM");
    	
	}
	
}
class Hero implements Vehicle
{
   public  void checkMileage(int km,int liter,double hour)
	{
    	
    	System.out.println("The Running Mileage of Hero is :"+(km/liter)+"KM");
    	System.out.println("The Engine Hour Mileage of Hero is :"+(km/(int)hour)+"KM");
    	System.out.println("The Actual Mileage of Hero is :"+((km/liter+km/(int)hour)/2)+"KM");
    	
	}
	
}
public class vehicleMileageUsingInterface {

	public static void main(String[] args) {
		int oil,km;
		double hour;
		Scanner Sc=new Scanner(System.in);
		Vehicle obj1=new Honda();
		Vehicle obj2=new Hero();
		
	
		while(true)
		{
			System.out.print("Enter 1 For Know Honda Mileage 2 for Hero 3 For Exit : ");
			int no=Sc.nextInt();
			if(no==1)
			{
				System.out.println("Enter Your Vehicle Oil,km,Engine Hour  : ");
				oil=Sc.nextInt();
				km=Sc.nextInt();
				hour=Sc.nextDouble();
				obj1.checkMileage(km, no, hour);
				System.out.println("-----------------------------------------------------------               ");
			}
			else if(no==2)
			{
				System.out.println("Enter Your Vehicle Oil,km,Engine Hour  : ");
				oil=Sc.nextInt();
				km=Sc.nextInt();
				hour=Sc.nextDouble();
				obj1.checkMileage(km, no, hour);
				System.out.println("------------------------------------");
			}
			else if (no==3)
			{
				break;
			}
			else
			{
				System.out.println("Enter The Valid Input");
			}
		}
		

	}

}
