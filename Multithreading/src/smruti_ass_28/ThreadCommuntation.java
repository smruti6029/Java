package smruti_ass_28;

class Mydata
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
class Producer extends Thread
{
	Mydata data;
	public Producer(Mydata data)
	{
		this.data=data;
	}
	public void run()
	{
		int i=0;
		while(true)
		{
		data.set(i);
		System.out.println("Producer "+i);
		i++;
		
		}
	}
}
class Consumer extends Thread
{
	Mydata data;
	public Consumer(Mydata data)
	{
		this.data=data;
	}
	public void run()
	{
		int i=0;
		while(true)
		{
		int value=data.get();
		System.out.println("Counsumer"+value);
		}
	}
}

public class ThreadCommuntation {

	public static void main(String[] args) throws InterruptedException {
		Mydata obj=new Mydata();
		Producer t1=new Producer(obj);
		Consumer t2=new Consumer(obj);
		t1.start();
//		t1.sleep(1000);
		t2.start();
//		t2.sleep(1000);

	}

}
