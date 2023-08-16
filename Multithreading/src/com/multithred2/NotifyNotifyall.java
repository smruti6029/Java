package com.multithred2;
class Notifye extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<5;i++)
			{
				System.out.println(i);
				try {
					System.out.println("Waiting for response");
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

public class NotifyNotifyall {

	public static void main(String[] args) {
		Notifye obj=new Notifye();
		obj.start();
		
		synchronized(obj)
		{
			System.out.println("Connecting");
			obj.notifyAll();
		}
		// TODO Auto-generated method stub

	}

}
