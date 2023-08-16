package smruti_june_20;

class Person
{
	String name="SMRUTI";
	public class Smruti
	{
		void show(int age)
		{
			int age1=age;
			System.out.println(name);
			System.out.println("the age is "+age1);
			
		}
	}
	void add()
	{
		Smruti obj=new Smruti();
		obj.show(23);
	}
}

public class OuterInner {

	public static void main(String[] args) {
		Person obj2=new Person();
		obj2.add();

	}

}
