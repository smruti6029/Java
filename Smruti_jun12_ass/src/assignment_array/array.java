package assignment_array;
import java.util.Scanner;

public class array {
	public static void main(String[]args)
	{
		int arr[];
		int i;
		arr=new int[20];
		Scanner obj=new Scanner(System.in);
		System.out.println("enter element in array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
	}

}
