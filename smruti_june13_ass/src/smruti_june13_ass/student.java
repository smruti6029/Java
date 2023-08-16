package smruti_june13_ass;

import java.util.Scanner;

public class student {
	int age;
	char grade;
	String name;
	void setNumber(int num,char grade,String name) {
		this.age=num;
		this.grade=grade;
		this.name=name;
	}
	int getage()
	{
		return age;
	}
	char getGrade()
	{
		return grade;
	}
	String getName()
	{
		return name;
	}
	void printDetails()
	{
		
		System.out.println("the name is -"+name);
		System.out.println("the age is-"+age);
		System.out.println("the grade is "+grade);
		
	}
	
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your name");
		String name=obj.nextLine();
		System.out.println("enter age");
		int i=obj.nextInt();
		System.out.println("enter Grade");
		char a=obj.next().charAt(0);
		student obj2=new student();
		obj2.setNumber(i,a,name);
		System.out.println(obj2.getName());
		System.out.println(obj2.getage());
		System.out.println(obj2.getGrade());
		obj2.printDetails();
		
		
	}
}
