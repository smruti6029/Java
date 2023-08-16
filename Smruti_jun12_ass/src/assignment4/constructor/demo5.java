package assignment4.constructor;
import java.util.*;
class demo
{
	demo()
	{
		System.out.println("enter number");
	}
	demo(int a,int b)
	{
		System.out.println("you enter" +"   "+a +"  " + b);
	}
	demo(String a,int b)
	{
		System.out.println(a+""+b);
		
	}
	
	
}


public class demo5 {

	public static void main(String[] args) {
		demo obj=new demo();
		demo obj1=new demo(2,4);
		
		demo obj2=new demo("master",2);
		
		

	}

}
