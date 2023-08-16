package smruti_june14_ass;
import java.util.*;

public class calculator {
//	calculator()
//	{
//		System.out.println("enter 1 to add 2 number");
//		System.out.println("enter 2 to add 3 number");
//		System.out.println("enter 1 to add  number");
//		
//		
//	}
	
//	add two number
	
	int add(int a,int b)
	{
		return a+b;
		
	}
//	add three number
	int add(int a,int b,int c)
	{
		return a+b+c;
		
	}
//	add two  doble number
	double add(double  a,double  b)
	{
		return a+b;
		
	}
	public static void main(String[]args)
	{
		int no,result,a,b;
		Scanner sc=new Scanner(System.in);
		calculator obj=new calculator();
		System.out.println("enter 1 to add 2 number");
		System.out.println("enter 2 to add 3 number");
		System.out.println("enter 3 to add  doble  number");
		no=sc.nextInt();
		switch(no)
		{
		case 1:
			System.out.println("enter two number");
			a=sc.nextInt();
			b=sc.nextInt();
			result=obj.add(a,b);
			System.out.println("the add of number"+a +""+ "" +b+"="+result);
		case 2:
			System.out.println("enter two number");
			a=sc.nextInt();
			b=sc.nextInt();
			int c=sc.nextInt();
			result=obj.add(a,b,c);
			System.out.println("Result = "+result);
		case 3:
			System.out.println("enter two number");
			double aa=sc.nextDouble();
			double bb=sc.nextDouble();
			double resultt=obj.add(aa,bb);
			System.out.println("the addition of double"+resultt);
			default :
			{
				System.out.println("Enter wrong");
			}
			
		
			
			
			
			
		}
		
	}

}
