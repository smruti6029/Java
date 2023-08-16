package atmManegment;

import java.util.*;

public class atmMachine {
	String account = "9348679015";
	String name = "Smruti Ranjan Nayak";
	int balance = 5000;

	void accountDetalis() {
		System.out.println("ACCOUNT NUMBER := " + account);
		System.out.println("YOUR NAME :=" + name);
		System.out.println("YOUR BALANCE := " + balance);

	}

	void balanceCheck() {
		System.out.println("Your balance --" + balance);
	}

	int moneyDeposit(int num) {
		return balance += num;
	}

	int moneyWithdraw(int bal)

	{
		if (bal >= balance) {
			System.out.println("YOU HAVE'T ENOUGH BALANCE");
		}

		else {
			return balance -= bal;
		}
		return balance;

	}

	atmMachine() {
		System.out.println("Welcome to Bank of India");

	}

	int atmPin(int num) {
		int pas = 2580;
		if (num == pas) {
			return 1;
		} else {
			return 0;
		}

	}

	void call() {

		System.out.println("enter 1 to balance Account detalis");
		System.out.println("enter 2 to balance check");
		System.out.println("enter 3 to balance Deposit");
		System.out.println("enter 4 to balance Withdraw");
		System.out.println("      ");

		int num, no = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number here");
		num = obj.nextInt();
		switch (num) {
		case 1:
			accountDetalis();
			System.out.println("enter 1 to countinue ");
			System.out.println("enter 0 to Exit");
			no = obj.nextInt();
			if (no == 1) {
				call();
			} else {
				break;
			}
		case 2:

			balanceCheck();
			System.out.println("enter 1 to countinue ");
			System.out.println("enter 0 to Exit");
			no = obj.nextInt();
			if (no == 1) {
				call();
			} else {
				break;
			}
		case 3:
			System.out.println("enter ammount :=");
			int bal = obj.nextInt();
			int totalbalance = moneyDeposit(bal);
			System.out.println(totalbalance);
			System.out.println("enter 1 to countinue ");
			System.out.println("enter 0 to Exit");
			no = obj.nextInt();
			if (no == 1) {
				call();
			} else {
				break;
			}
		case 4:
			System.out.println("enter ammount :=");
			int no2 = obj.nextInt();
			int balan = moneyWithdraw(no2);
			System.out.println("YOUR BALANCE IS NOW" + "   :=  " + balan);
			System.out.println("enter 1 to countinue ");
			System.out.println("enter 0 to Exit");
			no = obj.nextInt();
			if (no == 1) {
				call();
			} else {
				break;
			}
		default: {
			break;
		}

		}

	}

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		atmMachine obj = new atmMachine();
		System.out.println("Enter Your ATM PIN : - ");
		int pin = obj1.nextInt();

		int i = obj.atmPin(pin);
		if (i == 1) {
			obj.call();
		} else {
			System.out.println("WRONG PIN");
		}

	}
}
