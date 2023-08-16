// Create program to use the mentioned methods using java  multi-threading- 
//start(),run(),sleep(),currentThread(),getPriority(),setPriority(),isAlive(),stop(),
//destroy(),notify(),notifyAll() 

package com.multithred2;
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("INSIDE THREAD 1");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}}




public class UsingAllMethod {

	public static void main(String[] args) {
		Thread1 obj=new Thread1();
		
		obj.start();
		obj.setPriority(10);
		
		
		System.out.println(Thread.currentThread());	
		obj.stop();
		System.out.println("The Priority"+obj.getPriority());
		System.out.println("Alive      "+obj.isAlive());
		
	}

}
