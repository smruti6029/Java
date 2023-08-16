package smruti_june13_ass;
import java.util.*;

public class personConst {
	int age;
	String name;
	personConst()
	{
		System.out.println("enter age");
		Scanner obj=new Scanner(System.in);
		age=obj.nextInt();
		System.out.println(age);
		
		
	}
	personConst(String mas){
		name=mas;
		System.out.println(name);
	}
	public static void main(String[]args)
	{
		String s;
		int y;
		Scanner obj1=new Scanner(System.in);
		personConst objj=new personConst();
		System.out.println("enter name");
		s=obj1.nextLine();
		personConst obj3=new personConst(s);
		
		
	}
	

}
