//A vehicle consumes 200L Diesel to run for 10KM. and the engine hour of the vehicle is 10Hr. 
//so basically the mileage of the vehicle will be average of vehicle per hour mileage and vehicle km/l mileage.
//So create a project where we can calculate and show the mileage of the 
//vehicle dynamically(i.e all the values will provide in run time).

package com.assiment;
import java.util.*;
class  CalculateMileage
{
	private static CalculateMileage obj=new CalculateMileage();
	private CalculateMileage()
	{
		
	}
	final int runningMileage(int  km,int oilliter)
	{
		return km/oilliter;
	}
	final int engineHourMileage(int km,double hour)
	{
		return (km/(int)hour);
	}
	final int actualMileage(int km,int oiliter,double hour)
	{
		return ((km/oiliter)+(km/(int)hour))/2;
	}
	public static CalculateMileage getObject()
	{
		return obj;
	}
}
	 


public class VechilemilageFind {
public static void main(String[]args)
{
	int oilliter,km;
	double hour;
	Scanner sc=new Scanner(System.in);
	CalculateMileage obj=CalculateMileage.getObject();
	System.out.println("Enter The Vehicle Oil Consums liter oil :");
	oilliter=sc.nextInt();
	System.out.println("Enter The Vehicle Engine Hour : ");
	hour=sc.nextDouble();
	System.out.println("Enter The Vehicle Km");
	km=sc.nextInt();
	System.out.println("The Running Mileage of vehicle is :"+obj.runningMileage(km, oilliter));
	System.out.println("The Running Mileage of vehicle is :"+obj.engineHourMileage(km, hour));
	System.out.println("The Running Mileage of vehicle is :"+obj.actualMileage(km, oilliter,hour));
	
	
	
}
}
