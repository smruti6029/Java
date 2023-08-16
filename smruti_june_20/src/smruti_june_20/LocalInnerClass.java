//Local inner class

package smruti_june_20;
class Outur
{
	void display()
	{
		System.out.println("inside outur class");
		class inner
		{
			void show()
			{
				System.out.println("inside inner Class");
			}
		}
		inner obj=new inner();
		obj.show();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outur obj1 =new Outur();
		obj1.display();

	}

}
