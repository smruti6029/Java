//rite a Java program to create and start two threads. Each thread should print numbers 
//from 1 to 10. Ensure that the numbers are printed in sequence.
package com.multithred2;

class Thread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(" "+i);		
			
		}
		System.out.println("\n");
	}
	
}
class Thread4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(" "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n");

	}
	}

public class MultiTHread2 {

	public static void main(String[] args) throws InterruptedException {
		Thread3 obj=new Thread3();
		Thread4 obj1=new Thread4();
		obj.setPriority(10);
		obj1.setPriority(1);
		obj.start();
		obj.join();
		obj1.start();
		
		

}
}
