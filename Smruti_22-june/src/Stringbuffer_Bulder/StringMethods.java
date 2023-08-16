//Write a program using index of a character, performs concatenation, 
//replacement, and more. It also demonstrates methods specific to StringBuilder
//and StringBuffer such as appending, inserting, deleting, and reversing.

package Stringbuffer_Bulder;

public class StringMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("Rapid");
		sb.append(" ");
		sb.append("Soft");
		System.out.println(sb);
		sb.delete(2, 3);
		System.out.println(sb.toString());
		sb.insert(2,"p");
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb);
		StringBuffer sc=new StringBuffer();
		sc.append("Rapid");
		sc.append(" ");
		sc.append("Soft");
		System.out.println(sc);
		sc.delete(2, 3);
		System.out.println(sc.toString());
		sc.insert(2,"p");
		System.out.println(sc.toString());
		sc.reverse();
		System.out.println(sc);
		
		
		
		
		
		
		

	}

}
