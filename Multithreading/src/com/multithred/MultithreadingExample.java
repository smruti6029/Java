package com.multithred;

class A extends Thread
{
	public  void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" "+i);
			


		}
	}
}
class B extends Thread
{
	public synchronized  void run() 
	{
		int j;
		for(j=1;j<=10;j++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" "+j);
			
		}
		
	}
	
}
	

public class MultithreadingExample {
	public static void main(String args[]) throws IllegalThreadStateException, InterruptedException
	{
		A obj=new A();
		B obj1=new B();
		obj.start();
		obj1.start();

		obj1.join();
	}

}













