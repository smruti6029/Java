package com.multithred2;

class Number 
{
	int num;

	public  void put(int num)
	{
		this.num=num;
	}
	
	public void get()
	{
		System.out.println(this.num);
	}
}
class Thread6 implements Runnable
{
	Number q=new Number();
	int i=50;
	
	public void run()
	{
		q.put(++i);
		q.get();	
		
	}
}
class Thread7 extends Thread
{	Number q=new Number();
	public void run()
	{
	q.get();	
	}
}



public class MultiThreadNotify {

	public static void main(String[] args) {
		Thread6 obj=new Thread6();
		Thread obj2=new Thread(obj);
		Thread7 obj1=new Thread7();
		obj2.start();
		obj1.start();
		
	}

}
