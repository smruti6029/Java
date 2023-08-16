package smruti_june13_ass;
import java.util.*;

public class Rectangle {
	int lenght,width;
	int area(int l,int w)
	{
		lenght=l;
		width=w;
		int area=lenght*width;
		return area;
		
		
		
	}
	int periMeter(int l,int w)
	{
		lenght=l;
		width=w;
		int perimeter=2*(lenght+width);
		return perimeter;
		
	}
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		int len,wid,area,perimeter;
		System.out.println("ENTER RECTANGLE LENGTH =");
		len=obj.nextInt();
		System.out.println("ENTER RECTANGLE PERIMETER");
		wid=obj.nextInt();
		Rectangle obj2=new Rectangle();
		area=obj2.area(len, wid);
		perimeter=obj2.periMeter(len, wid);
		System.out.println("the area "+area);
		System.out.println("the perimeter"+perimeter);
		
		
	}

}
