package Com.DATE;

import java.time.LocalDate;
import java.time.LocalTime;

public class DAteApi {
	public static void main(String[] args) {
		
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
	}

}
