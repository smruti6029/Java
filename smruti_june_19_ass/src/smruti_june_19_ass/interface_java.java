package smruti_june_19_ass;
import java.util.*;
interface area
{
	int area(int r);
}
interface perimeter{
	int perimeter(int r);
}
class Cricle implements area,perimeter{
	@Override
	public int area(int r) 
	{
		int area=(int)(Math.PI*(r*r));
		return area;
	}
	@Override
	public int perimeter(int r)
	{
		int perimeter=(int)(2*Math.PI*(r));
		return perimeter;
	}
	
}


class Trangle implements area,perimeter
{
	int a,b,c;
	@Override
	public int area(int r)
	{
		System.out.println("enter breath and hight  side value");
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		b=sc.nextInt();
		
		
		int area=(int)(0.5*b*h);
		return area;
	}
	@Override
	public int perimeter(int k)
	{
		System.out.println("enter 3 side value");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int perimeter=a+b+c;
		return perimeter;
	}
}
public class interface_java {

	public static void main(String[] args) {
		
		{
			Scanner sc=new Scanner(System.in);
			Cricle obj=new Cricle();
			Trangle obj1=new Trangle();
			int radius;
			System.out.println("enter radius for area");
			radius=sc.nextInt();
			System.out.println("The Circle Area is :="+obj.area(radius));
			System.out.println("The Circle perimeter is :="+obj.perimeter(radius));
			System.out.println("The Trangle Area is :="+obj1.area(0));
			System.out.println("The Circle perimeter is :="+obj1.perimeter(0));
			
			
			
		}
		

	}

}
