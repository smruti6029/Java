//1. Create a Vehicle class as the base class with attributes like make, model, and year. Implement subclasses such as Car,
//Motorcycle, and Truck that inherit from Vehicle. 
//Override methods like calculateRentalCost() in each subclass
//based on specific rental rules. Use dynamic method dispatch to call the appropriate method based on the type of vehicle.
package smruti_june15_ass;
import java.util.*;

class vehicle{
	String Model;
	int manuFacture;
	int year;
	int rentfor_day;
	public int rentalCose(int days,int price)
	{
		return days*price;
	}
	void nano(int a) {
		System.out.println("YOU ARE ENTER THE WRONG NUMBER");
		
	}
	void audi(int days)
	{
		System.out.println("YOU ARE ENTER THE WRONG NUMBER");
	}
	void thar(int days)
	{
	System.out.println("YOU ARE ENTER THE WRONG NUMBER");
	}
	void creta(int days)
	{
		System.out.println("creta is not avilable");
	}
	
	
	void apache(int days){
	System.out.println("YOU ARE ENTER THE WRONG NUMBER");
	
	}
	void pulsure(int days)
	{
		System.out.println("YOU ARE ENTER THE WRONG NUMBER");
	}
	void splender(int days)
	{
		System.out.println("YOU ARE ENTER THE WRONG NUMBER");
	}
	void eicher(int days) {
		System.out.println("YOU ARE ENTER THE WRONG NUMBER");
		
	}
	void mahindra(int days) {
		System.out.println("YOU ARE ENTER THE WRONG NUMBER");
		
	}
	void tata(int days)
	{
		System.out.println("YOU ARE ENTER THE WRONG NUMBER");
		
	}
	
}
class car extends vehicle
{

	
	
		void nano(int days)
		{
			int manuFacture=2018;
			String model="Nano";
			int rentfor_day=300;
			System.out.println("manufacture date ="+manuFacture);
			System.out.println(model);
			System.out.println(rentfor_day);
			int price=rentalCose(days,rentfor_day);
			System.out.println(price);
			
		}
		void thar(int days)
		{
			int manuFacture=2020;
			String model="Thar";
			int rentfor_day=5000;
			System.out.println("manufacture date ="+manuFacture);
			System.out.println(model);
			System.out.println(rentfor_day);
			int price=rentalCose(days,rentfor_day);
			System.out.println(price);
			
		}
		void audi(int days)
		{
			int manuFacture=2000;
			String model="AUDI";
			int rentfor_day=10000;
			System.out.println("manufacture date ="+manuFacture);
			System.out.println(model);
			System.out.println(rentfor_day);
			int price=rentalCose(days,rentfor_day);
			System.out.println(price);
			
		}
		
}
	
	class  motorcycle extends vehicle
		{

		void apache(int days)
		{
			int manuFacture=2018;
			String model="apache";
			int rentfor_day=300;
			System.out.println("manufacture date ="+manuFacture);
			System.out.println("model is "+model);
			System.out.println("one day for rent"+rentfor_day);
			int price=rentalCose(days,rentfor_day);
			System.out.println(price);
			
		}
		void pulsure(int days)
		{
			int manuFacture=2020;
			String model="pulsure";
			int rentfor_day=500;
			System.out.println("manufacture date ="+manuFacture);
			System.out.println(model);
			System.out.println(rentfor_day);
			int price=rentalCose(days,rentfor_day);
			System.out.println(price);
			
		}
		void splender(int days)
		{
			int manuFacture=2000;
			String model="splender";
			int rentfor_day=100;
			System.out.println("manufacture date ="+manuFacture);
			System.out.println(model);
			System.out.println(rentfor_day);
			int price=rentalCose(days,rentfor_day);
			System.out.println(price);
			
		}
}
	class  truck extends vehicle
	{

	void eicher(int days)
	{
		int manuFacture=2018;
		String model="EICHER";
		int rentfor_day=1000;
		System.out.println("manufacture date ="+manuFacture);
		System.out.println("model is "+model);
		System.out.println("one day for rent"+rentfor_day);
		int price=rentalCose(days,rentfor_day);
		System.out.println(price);
		
	}
	void mahindra(int days)
	{
		int manuFacture=2020;
		String model="MAHINDRA";
		int rentfor_day=500;
		System.out.println("manufacture date ="+manuFacture);
		System.out.println(model);
		System.out.println(rentfor_day);
		int price=rentalCose(days,rentfor_day);
		System.out.println(price);
		
	}
	void tata(int days)
	{
		int manuFacture=2000;
		String model="TATA";
		int rentfor_day=800;
		System.out.println("manufacture date ="+manuFacture);
		System.out.println(model);
		System.out.println(rentfor_day);
		int price=rentalCose(days,rentfor_day);
		System.out.println(price);
		
	}
}





public class demo1 {
			public static void main(String[]args)
			{
				int days;
				Scanner sc=new Scanner(System.in);
				vehicle  obj =new car();
				vehicle  obj1 =new motorcycle();
				vehicle  obj2 =new truck();
				
			System.out.println("Press 1 for car 2 for bike 3 for TRuck");
			int input=sc.nextInt();
			switch (input)
			{
			case 1:
				System.out.println("Press 1 for NANO   2 for THAR  3 for AUDI 4 for Creta ");
				input=sc.nextInt();
				if(input==1)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj.nano(days);
					}
				else if(input==2)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj.thar(days);
					
				}
				else if(input==3)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj.audi(days);
					
				}
				else if(input==4)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj.creta(days);
					
				}
				else
				{
					System.out.println("invalid input");
				}
				break;
			case 2:
				System.out.println("Press 1 for APACHE   2 for PULSURE  3 for SPLENDER ");
				input=sc.nextInt();
				if(input==1)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj1.apache(days);
					}
				else if(input==2)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj1.pulsure(days);
					
				}
				else if(input==3)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj1.splender(days);
					
				}
				else
				{
					System.out.println("invalid input");
				}
				break;
			case 3:
				System.out.print("Press 1 for EICHER   2 for mahindra  3 for TATA ");
				input=sc.nextInt();
				if(input==1)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj2.eicher(days);
					}
				else if(input==2)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj2.mahindra(days);
					
				}
				else if(input==3)
				{
					System.out.println("enter how many days you want to rent");
					days=sc.nextInt();
					obj2.tata(days);
					
					
				}
				else
				{
					System.out.println("invalid input");
				}
				break;
				default:
					System.out.println("try again");
			
			
				
			}
				
			
			}

}