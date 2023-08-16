package smruti_june_20;
interface PersonMan
{
	void name();
	void adhhar();
	void age();
}
class Person2
{
	public void show()
	{
		PersonMan obj=new PersonMan()
				{
			@Override
			public void name()
			{
				System.out.println("name is Smruti RAnjan Nayak");
			}
			@Override
			public void adhhar()
			{
				System.out.println("adhhar no is 222222222222");
			}
			@Override
			public void age()
			{
				System.out.println("age is 23");
					
			}
				};
				obj.name();
				obj.adhhar();
				obj.age();
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person2 obj=new Person2();
		obj.show();
		
	}

}
