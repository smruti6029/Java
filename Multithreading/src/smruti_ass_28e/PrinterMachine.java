package smruti_ass_28e;

class Printer
{
	
	public synchronized void print(String name)
	{
		System.out.println(name+"Now using the   Printer");
	}
	
	
}
class Emploay extends Thread
{	Printer p;
	String name;
	public Emploay(Printer p,String name)
	{
		this.p=p;
		this.name=name;
		
	}
	public void run()
	{
		p.print(name);
		
	}
	
}class Emploay1 extends Thread
{	Printer p;
String name;
public Emploay1(Printer p,String name)
{
	this.p=p;
	this.name=name;
	
}
public void run()
{
	p.print(name);
	
}

}
public class PrinterMachine {
	public static void main(String[]args)
	{
		Printer p=new Printer();
		Emploay t1=new Emploay(p,"Rapidsoft ");
		Emploay1 t2=new Emploay1(p,"MeagaSoft ");
		
		t1.start();
		t2.start();
	}

}
