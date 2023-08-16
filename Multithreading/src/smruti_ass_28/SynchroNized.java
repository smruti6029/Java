package smruti_ass_28;
class MyData
{
	synchronized public void display(String str)
	{
		int i;
		for(i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}
class MyThread extends Thread
{
	MyData d;
	public MyThread(MyData d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display("Hello World");
	}
}
class MyThread2 extends Thread
{
	MyData d;
	public MyThread2(MyData d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display("Wel Come");
	}
}





public class SynchroNized {
	public static void main(String[]args)
	{
		MyData d=new MyData();
		MyThread t1=new MyThread(d);
		MyThread2 t2=new MyThread2(d);
		t1.start();
		t2.start();
	}

}























