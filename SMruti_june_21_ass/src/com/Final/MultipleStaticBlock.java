//Write a program implementing  multiple static blocks with a use-case scenario.
package com.Final;

class  Staticblock
{
	private double accountnumber=917883212;
	String name="Smruti ranjann nayak";
	static int amount;
	static
	{
		amount=5000;
		
	}
	void show()
	{
		System.out.println("Account "+name);
		System.out.println("Account Number "+(int)accountnumber);
		System.out.println("the total balance "+amount);
	}
}

public class MultipleStaticBlock {

	public static void main(String[] args) {
		Staticblock obj=new Staticblock();
		int depoit=500;
		Staticblock.amount+=depoit;
		
		
		obj.show();
		Staticblock.amount-=700;
		System.out.println("now balance"+Staticblock.amount);
		
		
	}

}
