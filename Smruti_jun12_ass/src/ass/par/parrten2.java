package ass.par;
import java.util.*;

public class parrten2{

	public static void main(String[] args) {
		int i,j,row;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter row");
		row=obj.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		
	}}
		
