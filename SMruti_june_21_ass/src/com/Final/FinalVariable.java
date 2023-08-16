// write a program to show in how many ways we can initialise the Final
// variable and use them in a method

package com.Final;

//using final instiale at time of declare
class Test
{
	final static int a=30;
	void show()
	{
		System.out.println(a);
	}
}
//using final instiale at time of constructor call
class Test1 {
	final  int a;
	 Test1(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	
}
//using final instiale at time of when object declar then static mathod call
class Test2
{
	final static int A;
	static
	{
		A=50;
		System.out.println(A);
	}
	
}
class Test3
{
	final int A;
	
	{
		A=50;
		System.out.println(A);
	}
	
}
public class FinalVariable {
	


	public static void main(String[] args) {
		Test obj=new Test();
		obj.show();
		Test1 obj1=new Test1(40);
		
		Test2 obj2=new Test2();
		Test3 obj3=new Test3();

	}

}
