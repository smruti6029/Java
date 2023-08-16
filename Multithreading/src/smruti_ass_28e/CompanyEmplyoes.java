package smruti_ass_28e;

class CoffieMachine
{
	String text;
	int noofemploy=0;
	int count=0;
	void noofemploy()
	{
		noofemploy++;
	}
	synchronized void write(String t)
	{
		System.out.println("Coffie is Making .............."+t);
		while(count!=0)
		{
			try {
				wait();
			} catch (InterruptedException e) {};
			}
		
		text=t;
		count=noofemploy;
		notifyAll();
	}
	synchronized String read()
	{
		while(count==0)
		{
			try {wait();} catch (InterruptedException e) {}
			}
		String t=text;
		count--;
		
		if(count==0)
		{
			notify();
		}
		return t;
	}
}

class Cofiee  extends Thread
{
	CoffieMachine cm;
	String machine[]={"Greean Tea","Coffe","Red Tea","Hot Water","END"};
	public Cofiee(CoffieMachine cm)
	{
		this.cm=cm;
	}
	public void run()
	{
		for(int i=0;i<machine.length;i++)
		{
			cm.write(machine[i]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	 
}
class Employ extends Thread
{
	CoffieMachine cm;
	String name;
	public Employ(String name,CoffieMachine cm)
	{
		this.cm=cm;
		this.name=name;
	}
	
	public void run()
	{
		String text;
		cm.noofemploy();
		do {
			text=cm.read();
			System.out.println(name + " Waiting for coffie   "+text);
			
		}while(!text.equals("END"));
	}
	
}


public class CompanyEmplyoes {

	public static void main(String[] args) {
		CoffieMachine wb=new CoffieMachine();
		Cofiee t=new Cofiee(wb);
		Employ t1=new Employ("Sandeep",wb);
		Employ t2=new Employ("Manajit",wb);
		Employ t3=new Employ("Biswajit",wb);
		Employ t4=new Employ("Ashis",wb);
		
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		

	}
}
