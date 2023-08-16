package smruti_ass_28e;


class Login
{
	synchronized void logIn(String name)
	{
		System.out.println("Now "+name+" is LOgin");
	}
	synchronized void logOut(String name) 
	{
	System.out.println("Now "+name+" is Log Out");	
	}
}

class Person extends Thread
{
	Login log;
	String name;
	public Person(Login log,String name)
	{
		this.log=log;
		this.name=name;
	}
	public void run()
	{
		log.logIn(name);
		log.logOut(name);
	}
}
public class SyncronizedDifferentSenario {

	public static void main(String[] args) {
		Login log=new Login();
		Person t1=new Person(log,"Mouse");
		Person t2=new Person(log,"Keyboard");
		Person t3=new Person(log,"Charger");
		Person t4=new Person(log,"Laptop");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
