package com.constantClass;

public class CalculateGrade {
	final public static String getGrade(double percentage)
	{
		
		 if (percentage >=80 && percentage <=100 ) {
		        return "Grade A";
		    } else if (percentage >=60 && percentage <=80) {
		        return "Grade B";
		    } else if (percentage >=40 && percentage <=60) {
		        return "Grade C";
		    } else if (percentage >=33 && percentage <=40) {
		        return "Grade D";
		    } else {
		        return "Grade F";
		    }
		
		
	}

}
