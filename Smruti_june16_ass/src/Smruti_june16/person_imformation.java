//Create a class called "Person" with a method "getDetails()" that returns a "Person" object. 
//Create a subclass called "Student" that extends "Person" and overrides the "getDetails()" method 
//to return a "Student" object. Implement a program to demonstrate covariant returns by calling 
//		the "getDetails()" method on both a "Person" object and a "Student" object.
//
//

package Smruti_june16;
class person
{
	public person getDetails()
	{
		System.out.println("inside person block");
		return new person();
		
		
	}
}
class Student extends person
{
	public Student getDetails()
	{
		System.out.println("inside Student block");
		return new Student();
//		return null;
	}
}


public class person_imformation {
	public static void main(String[]args)
	{
		Student obj=new Student();
		person obj1=new person();
		
		obj.getDetails();
		obj1.getDetails();
		
	}

}
