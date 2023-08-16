package smruti_ass_28e;
class ShowString
{
	void show(String...strings)
	{
		for(String x:strings)
		{
			System.out.println(x);
		}
		
	}
}
class Book extends Thread
{
	ShowString obj;
	String book[];
	public Book(ShowString obj,String...strings)
	{
		this.obj=obj;
		this.book=strings;
		
		
	}
	public void run()
	{
		obj.show(book);
	}
	
}

public class MonitorProgram {
	

	public static void main(String[] args) {
		ShowString obj=new ShowString();
		Book t1=new Book(obj,"Java","c","Recat");
		Book t2=new Book(obj,"Hindi","Eng","Odia");
		Book t3=new Book(obj,"Apritude","Reasoning","Math");
		t1.start();
		t2.start();
		t3.start();

	}

}
