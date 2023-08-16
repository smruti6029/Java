package smruti_june_19_ass;
//Create one abstract class Shape which contains two abstract methods 
//area and perimeter. create two classes Circle and Triangle which are extends the Shape 
//class  and declare the method bodies there. create the main class and call the mehods.

abstract class shape
{
	abstract int area();
	abstract int perimeter();
}
class circle extends shape
{
	int r=5;
	int area()
	{
		
		return (int)(Math.PI*r*r);
	}
	int perimeter()
	{
		return (int)(2*Math.PI*r);
		
	}
}
class trangle extends shape
{
	int a=5;
	int b=6;
	int c=8;
	public int area()
	{
		System.out.println("the area of trangle is "+(a*b));
		return 0;
	}
	public int perimeter()
	{
		System.out.println("the perimeter of trangle is "+(a+b+c));
		return 0;
	}
}
public class abstract_method_2 {

	public static void main(String[] args) 
	{
		circle obj1=new circle();
		System.out.println("the area of circle ="+obj1.area());
		System.out.println("the perimeter of circle ="+obj1.perimeter());
		trangle obj2=new trangle();
		obj2.area();
		obj2.perimeter();
		

	}

}
