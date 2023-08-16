package smruti_june_20;
interface Wheels
{
	
}
interface Engine
{
	
}
class Bike implements Wheels,Engine
{
	static void show()
	{
		System.out.println("Bike have 4 wheels");
	}
	static void show1()
	{
		System.out.println("it have Bs6 ENgine");
	}
}

public class CustumMarkerInterface {

	public static void main(String[] args) {
		Bike.show();
		Bike.show1();
		

	}

}
