//Create a class called "Vehicle" with a constructor that accepts a String parameter
//representing the vehicle's brand. Create a subclass called "Car" that extends "Vehicle" 
//and has a constructor that calls the superclass constructor using the "super" keyword. 
//Implement a program to demonstrate the use of the "super" keyword by creating a "Car" 
//object and displaying its brand.



package Smruti_june16;
import java.util.*;
class vehicle
{
	vehicle(String brand)
	{
		System.out.println(brand);
	}
}

class Car extends vehicle
{
	Car(String brand)
	{
		super(brand);
		
	}
}
public class vechile_using_super {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter brand");
		String brand=sc.nextLine();
		Car obj1=new Car(brand);
	}
	
	

}
