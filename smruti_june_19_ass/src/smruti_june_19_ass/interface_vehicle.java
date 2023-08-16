package smruti_june_19_ass;

interface vehicle
{
	public int wheels();
	public int Stroke();
}
class Bike implements vehicle
{
	public int wheels()
	{
		System.out.println("bike have 2 wheel");
		return 0;
		
	}
	public int Stroke()
	{
		System.out.println("its 2 stroke");
		return 0;
	}
}
class Car implements vehicle
{
	public int wheels()
	{
		System.out.println("Car have 2 wheel");
		return 0;
		
	}
	public int Stroke()
	{
		System.out.println("its 4 stroke");
		return 0;
	}
}


class Truck implements vehicle
{
	public int wheels()
	{
		System.out.println("Truck have 6 wheel");
		return 0;
		
	}
	public int Stroke()
	{
		System.out.println("its 6 stroke");
		return 0;
	}
}






public class interface_vehicle {
	public static void main(String[]args)
	{
		vehicle obj1=new Bike();
		vehicle obj2=new Car();
		vehicle obj3=new Truck();
		obj1.wheels();
		obj1.Stroke();
		
		obj2.wheels();
		obj2.Stroke();
		obj3.wheels();
		obj3.Stroke();
		
	}

}
