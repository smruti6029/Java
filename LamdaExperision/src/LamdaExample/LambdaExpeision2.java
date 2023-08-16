package LamdaExample;
@FunctionalInterface
	interface Draw1
	{
		int show(int a,int b);
	}

public class LambdaExpeision2 {
		public static void main(String[]args)
		{
			Draw1 d=(a,b)->{
				return a+b;};
				System.out.println(d.show(5,8));
			
		 
		}

	}


