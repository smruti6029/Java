package smruti_june14_ass;
class animal
{
	void makeSound()
	{
		System.out.println("ANIMAL IS MAKE IN SOUND");
	}
}
class cat
{
	void makeSound()
	{
		System.out.println("CAT IS MAKE IN SOUND");
	}
	
}

public class soundOfanimal {
	public static void main(String[]args)
	{
		cat obj=new cat();
		animal obj2=new animal();
		obj.makeSound();
		obj2.makeSound();
	}

}
