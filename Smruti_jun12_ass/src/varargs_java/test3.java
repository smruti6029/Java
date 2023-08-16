package varargs_java;

public class test3 {
	static void fun(int... a)
	{
		System.out.println(a.length);
		for(int i:a)
		{
//			System.out.print(i +"  ");
		}
	}
	public static void main(String[]args)
	{
//		
		fun(2,3,4,5,6,7,6);
		StringBuffer sb=new StringBuffer("hii");
		StringBuffer sb1=new StringBuffer("hii");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		
	}

}
