//Write a single program to showcase all the access modifiers implementation.

package com.Final;

public class AccessModifier {
	private void show()
	{
		System.out.println("Inside private mathod");
		
	}
	protected void show1()
	{
		System.out.println("inside Protected Method");
	}
	void show2()
	{
		System.out.println("Inside Defult Method");
	}
	public void show3()
	{
		show();
		System.out.println("inside public method");
	}

	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		obj.show3();
		obj.show1();
		obj.show2();

	}
}


