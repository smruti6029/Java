package assignment_switch;
import java.util.*;
public class demo2 {
	public static void main(String[]args)
	{
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number between 7");
		num=obj.nextInt();
		switch (num)
		{
		case 1:
			
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invilled number");
		
		
	}

}
}
