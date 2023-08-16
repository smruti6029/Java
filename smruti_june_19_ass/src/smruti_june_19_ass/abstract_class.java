package smruti_june_19_ass;

abstract class vehcleClass
{
	abstract String StartEngine(String start);
	abstract String StopEngine(String stop);
}
class bike extends vehcleClass
{
	bike()
	{
		System.out.println("ITS UNDER THE BIKE");
	}
	@Override
	String StartEngine(String start)
	{
		System.out.println("BIKE START");
		
		return null;
	}

	@Override
	String StopEngine(String stop) {
		System.out.println("Bike Stop");
		return null;
	}
	
}
class car extends vehcleClass
{
	car()
	{
		System.out.println("ITS UNDER THE CAR");
	}
	@Override
	String StartEngine(String start)
	{
		System.out.println("Car START");
		
		return null;
	}

	@Override
	String StopEngine(String stop) {
		System.out.println("Car Stop");
		return null;
	}
	
}
class truck extends vehcleClass
{
	truck()
	{
		System.out.println("under the truck");
	}
	@Override
	String StartEngine(String start)
	{
		System.out.println("Truck START");
		
		return null;
	}

	@Override
	String StopEngine(String stop) {
		System.out.println("Truck Stop");
		return null;
	}
	
}






public class abstract_class {

	public static void main(String[] args) {
		vehcleClass obj1=new bike();
		obj1.StartEngine("Start");
		obj1.StopEngine("Stop");
		vehcleClass obj2 =new car(); 
		obj2.StartEngine("Start");
		obj2.StopEngine("Stop");
		
		vehcleClass obj3=new truck();
		obj3.StartEngine("Start");
		obj3.StopEngine("Stop");
		

	}

}
