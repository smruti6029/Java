package smruti_ass_28e;


class Myshop
{
	int value;
	boolean flag=true;
	synchronized public void set(int v)
	{
		while(flag!=true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		value=v;
		flag=false;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
	synchronized public int get()
	{
		while(flag!=false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
		return value;
	}
}
class  Seller extends Thread
{
	Myshop data;
	public Seller(Myshop data)
	{
		this.data=data;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
		data.set(i);
		System.out.println("Selling "+i);
		i++;
		
		}
	}
}
class Custumer extends Thread
{
	Myshop data;
	public Custumer(Myshop data)
	{
		this.data=data;
	}
	public void run()
	{
		int i=0;
		while(true)
		{
		int value=data.get();
		System.out.println("Custumer"+value);
		}
	}
}




public class ThreadCommuncation {

	public static void main(String[] args) {
		Myshop obj=new Myshop();
		Seller t1=new Seller(obj);
		Custumer t2=new Custumer(obj);
		t1.start();
		t2.start();

	}

}
