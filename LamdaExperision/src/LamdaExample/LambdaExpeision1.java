package LamdaExample;
interface Draw
{
	void show(String a);
}

public class LambdaExpeision1 {
	public static void main(String[]args)
	{
		Draw d=(a)->{
			System.out.println("Inside Show"+a);
		};
		d.show("Master");
	}

}
