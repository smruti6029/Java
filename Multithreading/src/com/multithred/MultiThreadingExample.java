package com.multithred;

class Thread2 extends Thread
{
	boolean value=false;
	public void run()
	{
		
		int i;
		
		for(i=0;i<5;i++) 
		{
			while(value)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		System.out.println("Inside run");
		value=false;
		}
	}}

public class MultiThreadingExample {

	public static void main(String[] args) throws InterruptedException {
		Thread2 obj=new Thread2();
		obj.start();
		
		
		
		for(int i=0;i<5;i++)
		{
			while(obj.value)
			{
				MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
				multiThreadingExample.wait();
			}
		System.out.println("inside main Thread");
			obj.value=true;
			
		}
		
		
	}

}
