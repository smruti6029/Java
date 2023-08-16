package com.multithred;

class Thread1 extends Thread
{
	public void run()
	{
		int i=1;
		while(1<100)
		{
		System.out.println("Inside thread1 Method");
		i++;
		}
	}
}

public class AllMethodUsingThread {

	public static void main(String[] args) {
		Thread1 obj=new Thread1();
		obj.start();
		System.out.println(obj.getName());
		obj.setName("My Thread");
		System.out.println(obj.getName());
		obj.setPriority(10);
		System.out.println(obj.getPriority());
		System.out.println(obj.getState());
		
		

	}

}
