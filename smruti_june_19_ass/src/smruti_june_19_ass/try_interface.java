package smruti_june_19_ass;

class a
{
	int x=7;
	class b
	{
		int b;
		void show()
		{
			System.out.println(x+"    "+b);
		}
	}
}


public class try_interface extends a {
	public static void main(String[]args)
	{
		a.b obj=new a().new b();
		obj.show();
		
		
	}

}
