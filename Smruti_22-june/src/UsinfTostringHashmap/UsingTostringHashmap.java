package UsinfTostringHashmap;


//Write a program that creates an object of a Person class represents a person with
//a name and age. and overrides the toString() ,equals(),hashCode().
class Person
{
	String name;
	int age;
	void setName(String name)
	{
		this.name=name;
	}
	void setAge(int age)
	{
	this.age=age;	
	}
	public  String toString()
	{
		return (name+" age"+age);
	}
	public int hashCode()
	{
		return 300;
	}
	public boolean equles(Object o)
	{
		return this.hashCode()==o.hashCode();
		
	}
	
}

public class UsingTostringHashmap {
	

	public static void main(String[] args) {
		Person obj=new Person();
		obj.setAge(23);
		obj.setName("Rapidsoft");
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj));
		

	}

}
