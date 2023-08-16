//Create a program for bank account management system that handles different types of accounts. 
//Create a BankAccount superclass with attributes like accountNumber, balance,
//and methods like withdraw() and deposit(). 
//Implement subclasses such as SavingsAccount and CheckingAccount that inherit from BankAccount 
//and override methods as needed. Use the super keyword to invoke superclass methods when 
//necessary
package smruti_june15_ass;
import java.util.*;
class BankAccount{
	final private double accountnumber=630882;
	static int balance=1000;
	String Name="SMRUTI RANJAN NAYAK";
	static int trancation=10;
	static int exit=0;
	public void accountImformation()
	{
		System.out.println("YOUR ACCOUNT NUMBER :="+(int)accountnumber);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("YOUR NAME "+Name);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("YOUR BALANCE "+balance);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public int withdraw(int money)
	{
		if(trancation<5)
		{
		if(money>balance)
		{
			System.out.println("Insufficent Balance");
			System.out.println("--------------------------------------------------");
		}
		else {
			
			
		balance=balance-money;
		System.out.println(balance);
		trancation++;
			}
	
		return balance;
		}
		else {
			System.out.println("TRANCATION EXCIDED");
			System.out.println("you can try in 24 hour");
		}
		return balance;
		
	}
	public int deposit(int money)
	{
		if(trancation<5)
		{
		balance+=money;
		trancation++;
		return balance;
		}
		else {
			System.out.println("TRANCATION EXCIDED");
			System.out.println("you can try in 24 hour");
		}
		return balance;
		
	}
		
		
		
		
//		------------------------------------------------------
	void check()
	{
		System.out.println(balance);
	}
	
}
class SavingsAccount extends BankAccount{
	public int withdraw(int money)
	{
		trancation++;
		
		return super.withdraw(money);
	}
	public int deposit(int money)
	{
		trancation++;
		balance+=money;
		return balance;
	}}
class CheckingAccount extends BankAccount
{
	void check()
	{
	System.out.println("YOUR HAVE DONE  := "+trancation+" Trancation");
	System.out.println("--------------------------------------------------");
	System.out.println("YOUR BALANCE IS NOW := "+balance);
	System.out.println("--------------------------------------------------");
	}
}


public class bank_Mannagement_system {
	public static void printScreen()
	{
		int money,no,balance;
		Scanner sc=new Scanner(System.in);
	BankAccount obj=new SavingsAccount();
	BankAccount obj1=new CheckingAccount();
	System.out.println("1 for DEPOSIT MONEY ");
	System.out.println("2 for Withraw");
	System.out.println("3 for balance check ");
	System.out.println("4 for Account IMformation");
	System.out.println("--------------------------------------------------");
	
	no=sc.nextInt();
	if(no==1)
	{
		System.out.println("ENTER AMMOUNT FOR DEPOSIT     ");
		money=sc.nextInt();
		balance=obj.deposit(money);
		
	}
	else if(no==2)
	{
		System.out.println("ENTER AMMOUNT FOR WITHDRAW         ");
		
		money=sc.nextInt();
		System.out.println("--------------------------------------------------");
		balance=obj.withdraw(money);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("YOUR BALANCE IS NOW     :="+balance);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	else if(no==3)
	{
		obj1.check();
		
	}
	else if(no==4)
	{
		obj.accountImformation();
	}
	else
	{
		System.out.println("YOU HAVE ENTERED INVALIED KEY");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
	
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    int againrun=0;
		printScreen();
		System.out.println("--------------------------------------------------");
		System.out.println("Enter 0 for exit ,enter 1 for more trancation");
		againrun=sc.nextInt();
		while(againrun!=0)
		{
			printScreen();
		}
	}

}


