//Create a program for calculates the area and perimeter of different shapes. 
//Create a Shape superclass with methods like calculateArea() and calculatePerimeter(). 
//Implement subclasses like Circle, Rectangle, and Triangle that override these methods with shape-specific calculations. 
//se covariant return types to provide appropriate return types for the overridden methods.


package smruti_june15_ass;
import java.util.*;

class shape{
	
	int side1;
	int side2;
	double area;
	double perimetre;
	
	void calculateArea(int side1 ,int side2) {
		System.out.println("default area is being calculated");
		
	}
	
	void calculatePerimeter(int side1 ,int side2) {
       System.out.println("defatlt perimeter is being calculated");		
		
	}
	
	
}

class circle extends shape{
	
	void calculateArea(int radius,int pi) {
	 
		
		double area= radius *radius *3.14;
		
		System.out.println("area of the circle " + area);
		
	}
	
	void calculatePerimeter(int radius ,int pi) {
		
		double per = 2*radius*pi;
		System.out.println("perimeter of the circle " + per);
		
		
	}
	
	
	
}

class rectangle extends shape{
	
	void calculateArea(int L ,int B) {
		int area = L * B;
		System.out.println("rectangle area =" +area);
		
	}
	
	void calculatePerimeter(int L ,int B) {
		int per = 2*(L+B);
       System.out.println("retangle perimeter = " +per );		
		
	}
	
	
}

class triangle extends shape{
	
	void calculateArea(int base ,int height) {
		
		double area= 0.5*base*height; 
		System.out.println("area of triangle =" + area);
		
		
	}
	
	void calculatePerimeter(int base ,int height) {
		
		int per = base *height;
		
		System.out.println("perimeter of the triangle = "+ per);
		
	}
}
	
	public class calculate_area {


		public static void main(String[] args) 
		{
			int py=22/7;
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter a number");
//			int res=sc.nextInt();
	        shape s1= new circle();
	        s1.calculateArea(7, py);
	        s1.calculatePerimeter(10,py);
	      
	      
	      shape s2 = new rectangle();
	      s2.calculateArea(10, 20);
	      s2.calculatePerimeter(10, 20);
	      
	      
	      shape s3 = new triangle();
	      s3.calculateArea(3,4);
	      s3.calculatePerimeter(3, 4);
	      
		}

	}