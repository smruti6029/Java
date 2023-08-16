package Com.DATE;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Example2 {
	
	public static void main(String[] args) {
//		String date="";
//		String[] split = date.split("/");
//		int dd=Integer.parseInt(split[0]);
//		int mm=Integer.parseInt(split[1]);
//		int yy=Integer.parseInt(split[2]);
		Date date1=new Date("04/14/2001");
		System.out.println(date1);
		Date dates=new Date();
//		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("Age=" +Period.between(dates.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),  date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
//		System.out.println(formatter.format(dates));
//		System.out.println(dates.get);
		
//		var d1=LocalDate.of(yy,mm,dd);
//		var d2=LocalDate.now();
//		
//		var p=Period.between(d1, d2);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Manajit");
		arr1.add("Sandeep");
		System.out.println(arr1);
		
		arr.add(33);
		arr.add(44);
//		
//		System.out.println("Days "+p.getDays()+" Month  "+p.getMonths()+" Year "+p.getYears());
		Object[] objArray = new Object[2];
		objArray[0]=arr;
		objArray[1]=arr1;
		System.out.println(objArray[0]);
		System.out.println(objArray[1]);
		
		
		
	
			
	}
	
}

