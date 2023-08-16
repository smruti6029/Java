//Create a class called "Vehicle" with a method "startEngine()".
//Create another class called "Car" that extends "Vehicle" and overrides 
//the "startEngine()" method to display "Car engine started." 
//Implement a program to demonstrate upcasting and call the "startEngine()" 
//method on both a "Vehicle" object and a "Car" object.
//



package Smruti_june16;

class vechile_Start_engine
{
	void startEngine()
	{
	System.out.println("engine Start");
	}
	

}
class car extends vechile_Start_engine 
{
	void startEngine()
	{
	System.out.println("car engine Start");
	}
}
public class vechile_Start
{
	public static void main(String[]args)
	{
		vechile_Start_engine obj1=new car();
		vechile_Start_engine obj2= new 	vechile_Start_engine();
		obj1.startEngine();
		obj2.startEngine();
	}
	
}

