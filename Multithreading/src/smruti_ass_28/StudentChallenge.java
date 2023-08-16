package smruti_ass_28;

class WhiteBoard
{
	String text;
	int noofstudent=0;
	int count=0;
	void attendence()
	{
		noofstudent++;
	}
	synchronized void write(String t)
	{
		System.out.println("Teacher Writting.............."+t);
		while(count!=0)
		{
			try {
				wait();
			} catch (InterruptedException e) {};
			}
		
		text=t;
		count=noofstudent;
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

class Teacher extends Thread
{
	WhiteBoard wb;
	String notes[]={"java","Thread","String","Opretor","END"};
	public Teacher(WhiteBoard wb)
	{
		this.wb=wb;
	}
	public void run()
	{
		for(int i=0;i<notes.length;i++)
		{
			wb.write(notes[i]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	 
}
class Student extends Thread
{
	WhiteBoard wb;
	String name;
	public Student(String name,WhiteBoard wb)
	{
		this.wb=wb;
		this.name=name;
	}
	
	public void run()
	{
		String text;
		wb.attendence();
		do {
			text=wb.read();
			System.out.println(name + "Reading   "+text);
			
		}while(!text.equals("END"));
	}
	
}

public class StudentChallenge {

	public static void main(String[] args) {
		WhiteBoard wb=new WhiteBoard();
		Teacher t=new Teacher(wb);
		Student t1=new Student("Sandeep",wb);
		Student t2=new Student("Manajit",wb);
		Student t3=new Student("Biswajit",wb);
		Student t4=new Student("Ashis",wb);
		
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		

	}

}
