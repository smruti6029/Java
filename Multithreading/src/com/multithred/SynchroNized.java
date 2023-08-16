package com.multithred;

class Atm
{
	synchronized void checkBalance(String name,int balance)
	{
		
		System.out.println("Check balance"+name+" "+balance);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized void withDraw(String name,int balance)
	{
		System.out.println("Withdrw"+name+" "+balance);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Custumer extends Thread
{
	String name;
	int balance;
	Atm a=new Atm();
	Custumer(String name,int balance,Atm a)
	{
		this.name=name;
		this.balance=balance;
		this.a=a;
	}
	public void run()
	{
		a.checkBalance(name, balance);
		a.withDraw(name, balance);
	}
}
public class SynchroNized {

	public static void main(String[] args) {
		Atm a=new Atm();
		Custumer obj=new Custumer("Master   ",1000,a);
		Custumer obj1=new Custumer("Smruti    ",1000,a);
		obj.start();
		obj1.start();
		

	}

}
