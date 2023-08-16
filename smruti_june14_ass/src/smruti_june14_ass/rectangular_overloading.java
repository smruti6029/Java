package smruti_june14_ass;
import java.util.*;

public class rectangular_overloading {
//	Here provideing only lenght
	int area(int len)
	{
		return len*(len*len);
		
	}
//	Here provideing lenght and width
	
	int area(int lenght,int width)
	{
		return (lenght*width);
	}
	public static void main(String[]args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		rectangular_overloading obj=new rectangular_overloading();
		
		System.out.println("if you hava only lenght press 1 ");
		System.out.println("if you hava lenght press 2");
		a=sc.nextInt();
		if(a==1)
		{
			System.out.println("enter lenght");
			int s=sc.nextInt();
			int result=obj.area(s);
			System.out.println(result);
		}
		else if(a==2)
		{
			System.out.println("enter lenght,width");
			int s=sc.nextInt();
			int r=sc.nextInt();
			int result=obj.area(s,r);
			System.out.println(result);
		}
		else {
			System.out.println("enetr right option");
		}
		
		
		
	}
	
	
}
