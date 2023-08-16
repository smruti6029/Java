package DatePackage;

public class DateClass {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()/1000/60/60/24);
		long time=System.currentTimeMillis();
		System.out.println(time);
		int dd=(int) (time/1000/60/60/24);
		System.out.println(dd);
		

	}

}
