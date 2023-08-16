package smruti_june13_ass;
import java.util.*;
public class person {
	int age;
	String name;
	void age()
	{
		Scanner obj=new Scanner(System.in);
		
		age=obj.nextInt();
		System.out.println(age);
		
	}
	void name()
	{
		Scanner obj1=new Scanner(System.in);
		name=obj1.nextLine();
		System.out.println(name);
		
	}
	public static void main(String[]args)
	{
		
		person obj3=new person();
		System.out.println("enter age");
		System.out.println("enter name");
		obj3.age();
		obj3.name();
		
		
		
		
		
	}
}
