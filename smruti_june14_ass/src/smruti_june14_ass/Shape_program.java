package smruti_june14_ass;

import java.util.*;



class shape  {
	
	
	 double calculateArea(double i) {
			return 3.14*i*i;
		}
	 
		double calculateArea(double a, double b) {
			
			 return a*b;
		}
		
		double calculateArea(double x , double y , double z) {
			double s = (x+y+z)/2;
			double a = (Math.sqrt(s*(s-x)*(s-y)*(s-z)));
			return a;
			
		}
		
	
	
}

class circle extends shape{
	
	 void  calculateArea(){
			System.out.println("default area is calulated of circle");
		}
	
	
	
}

class rectangle extends shape{
	
	 void  calculateArea(){
			System.out.println("default area is calulated of rectangle");
		}
	
	
}

class triangle extends shape{

	
	 void  calculateArea(){
			System.out.println("default area is calulated of triangle");
		}
	
}
public class Shape_program {

	public static void main(String[] args) {
		shape s1 = new circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double ss=sc.nextDouble();
		System.out.println("area of circle "+s1.calculateArea(ss));
		System.out.println("enter 2 number");
		double sss=sc.nextDouble();
		double ssss=sc.nextDouble();
		shape s2 = new rectangle();
		System.out.println("area of rectangle "+s2.calculateArea(ss,ssss));
		System.out.println("Enter 3 number ");
		double ne=sc.nextDouble();
		double nee=sc.nextDouble();
		double neee=sc.nextDouble();
		shape s3 = new triangle();
		System.out.println("area of the triangle "+s3.calculateArea(ne,nee,neee));
        
		
	}

}


