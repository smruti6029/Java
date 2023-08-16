package smruti_june_20;
import java.io.*;

public class ClonebleInterface implements Cloneable{
	int id;
	String name;
	int phone;
	ClonebleInterface(int id,int phone,String name)
	{
		super();
		this.id=id;
		this.name=name;
		this.phone=phone;
		System.out.println(this.id);
//		System.out.println("the person name is := "+name);
//		System.out.println("the person id : ="+id);
//		System.out.println("the person phone is :="+phone);
		     
	}
	void show()
	{
		System.out.println("the person name is := "+name);
		System.out.println("the person id : ="+id);
		System.out.println("the person phone is :="+phone);
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		ClonebleInterface obj=new ClonebleInterface(4,1234,"Smruti");
		obj.show();
		ClonebleInterface obj2=(ClonebleInterface) obj.clone();
		System.out.println(obj2.name);
		
		obj2.show();
		
		
		
	}

}
