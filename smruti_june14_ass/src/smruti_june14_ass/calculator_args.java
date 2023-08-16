package smruti_june14_ass;
import java.util.*;
class demo{
	int add(int... a)
	{
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
		
	}

}

public class calculator_args {
	public static void main(String[]args)
	{
		int i;
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" how many element you want to add");
		int y=sc.nextInt();
		int[] arr=new int[y];
		for(i=0;i<y;i++)
		{
			System.out.println("enter number here :=");
		arr[i]=sc.nextInt();
		}
		demo obj=new demo();
		int result=obj.add(arr);
		System.out.println(result);
		
	}

}
