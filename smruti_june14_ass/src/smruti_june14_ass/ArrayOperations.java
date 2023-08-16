package smruti_june14_ass;
import java.util.*;

public class ArrayOperations {
//	logic for int maximum
	int max(int... a)
	{
		int max=a[0];
		
		for(int b:a)
		{
	
			if(b>max)
			{

				max=b;
			}
		}
		return max;
		
		
	}
//	logic for doble to check maximum
	double max(double... a)
	{
		double max=a[0];
		
		for(double b:a)
		{
	
			if(b>max)
			{

				max=b;
			}
		}
		return max;
	}
	
	
//	logic for string checking
		String max(String... h)
		{ 
			String max=h[0];
			int i;
			
			
			for(i=1;i<h.length-1;i++);
		
			{
						if(max.compareTo(h[i])<0)   
							max=h[i];
						
					}
			
			return max;
		}
		
	
	public static void main(String[]args)
	{
		ArrayOperations obj=new ArrayOperations();
		Scanner sc=new Scanner(System.in);
		
//		its using for intiger element
		
		int []a= new int[100];
		System.out.println("how many number you want to enter");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("enter number here");
			a[i]=sc.nextInt();
		}
		int result=obj.max(a);
		System.out.println(result+"the maxmimum in number");
		
//		its use for double
		double aa[]=new double[100];
		System.out.println("how many number you want to enter double");
		int noo=sc.nextInt();
		for(int i=0;i<noo;i++)
		{
			System.out.println("enter double number here");
			aa[i]=sc.nextDouble();
		}
		double result2=obj.max(aa);
		System.out.println(result2+"the maximum = ");
		
		
//		its use for string input
		System.out.println("enter how many string you want to enter");
		int y=sc.nextInt();	
		
		String[] aaa=new String[y];
		for(int i=0;i<y;i++)
			
		{
			
			System.out.println("enter string here");
			aaa[i]=sc.next();
			
			
		}
		String resultt=obj.max(aaa);
		System.out.println("the maximum length in string are :="+resultt);
		
		
		
	}
}
