// Create a class called "Shape" with a method "calculateArea()".
// Create two subclasses, "Rectangle" and "Circle", that inherit from the "Shape"
// class and override the "calculateArea()" method to calculate the area of a rectangle 
// and circle, respectively. Implement a program to demonstrate method overriding by calling the 
// "calculateArea()" method on objects of both subclasses.





package Smruti_june16;
import java.util.*;

class shape
{
	
	double calculateArea(double lenght,double width)
	{
		return lenght*width;
		
		
	}
}
class rectangle extends shape{
	double calculateArea(double lenght,double width)
	{
		return lenght*width;
	}
	
}
class circle extends shape{
	double calculateArea(double r,double width)
	{
		return 3.14*(r*r);
	}
}




public class calculate_area {
	public static void main(String[]args)
	{
		shape obj1=new circle();
		shape obj2=new rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius for calculate area of circle");
		double radius=sc.nextDouble();
		System.out.println("area of circle"+obj1.calculateArea(radius,0.0));
		System.out.println("enter rectangle lenght and width");
		double lenght=sc.nextDouble();
		double width=sc.nextDouble();
		
		System.out.println("area of rectangle"+obj2.calculateArea(lenght, width));
		
	}
	
	
	
	
	
	

}
