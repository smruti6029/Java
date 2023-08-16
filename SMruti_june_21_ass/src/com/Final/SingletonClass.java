//Write a program to restrict a class to create more than one object .

package com.Final;
import java.util.*;
class Test4
{
	static private Test4 obj=null;
	
	void show()
	{
		System.out.println("inside single term class");
	}


	static Test4 getInstance()
{
	if(obj==null)
	{
		obj=new Test4();
		
	}
	return obj;
}
}

public class SingletonClass {

	public static void main(String[] args) {
		Test4 obj=Test4.getInstance();
		Test4 obj1=Test4.getInstance();
		Test4 obj2=Test4.getInstance();
		obj.show();
		if(obj==obj1 && obj==obj2)
		{
			System.out.println("Same Address");
		}

	}

}
