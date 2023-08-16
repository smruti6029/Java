package BinarySerch;
import java.util.*;

class SerchElement
{
	private static SerchElement obj= new SerchElement();
	private SerchElement()
	{
		
	}
	
	
	int serchElement(int[] arr,int search)
	{
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]<search)
			{
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			
		}
		
		return 0;
	}
	public static SerchElement getObject()
	{
		return obj;
	}
}
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter The Size Of Array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Element in array");
		for(i=0;i<size;i++)
		{
			System.out.println("Enter Element :");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The sorted Element IN array"+Arrays.toString(arr));
		SerchElement obj=SerchElement.getObject();
		System.out.println("Enter The Element The Element To Serch");
		int search=sc.nextInt();
		int result=obj.serchElement(arr, search);
		if(result==0)
		{
			System.out.println("The Element Not Present ");
		}
		else
		{
			System.out.println("Element Present at "+(result+1));
		}
		

	}

}
