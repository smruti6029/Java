//Write a program that demonstrates the usage of wrapper classes by 
//converting an integer to a string and a string to an integer.

package com.Wrapper;

public class ConvertInegerToString {

	public static void main(String[] args) {
		int a=10;
		String b=Integer.toString(a);
		System.out.println(b);
		String s="43";
		Integer bb=Integer.parseInt(s);
		System.out.println(bb);

	}

}
