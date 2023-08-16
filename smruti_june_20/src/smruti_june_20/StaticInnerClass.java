package smruti_june_20;
class showThenumber
{
	static int number=0;
	static class useTheNumber
	{
		public void show()
		{
			number++;
			System.out.println(" THe NUMBER IS NOW "+number);
		}
		

	}
	
}

public class StaticInnerClass {
	public static void main(String[]args)
	{
		showThenumber.useTheNumber obj2=new showThenumber.useTheNumber();
		System.out.println("The Number is NOW"+showThenumber.number);
		obj2.show();
		obj2.show();
		obj2.show();
	}
}
