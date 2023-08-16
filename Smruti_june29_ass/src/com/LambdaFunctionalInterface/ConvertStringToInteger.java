//create a functional interface called Converter with a method convert(String str) 
//that returns an integer. Write a lambda expression that implements the Converter interface 
//to parse a string and return its length as an integer.

package com.LambdaFunctionalInterface;
import java.util.*;
interface StringToNumber{
	void stringToNumber(String a);
}

public class ConvertStringToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringToNumber STN=(String a)->{
		System.out.println(a.length());
	};
	System.out.println("Enter String");
	String strings=sc.nextLine();
	STN.stringToNumber(strings);
	
	
	}
}
