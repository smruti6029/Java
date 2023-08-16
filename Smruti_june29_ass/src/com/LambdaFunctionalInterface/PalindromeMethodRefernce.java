//create a StringValidator class with an instance method isPalindrome() that checks if a given
//string is a palindrome. .Use a method reference  to refer to the instance method. 
//Check if each word in the array is a palindrome.

package com.LambdaFunctionalInterface;
interface Palindrome
{
	void isPalindrome(String[] a);
}
class StringValidator
{
	static String  aa;
	public static boolean match(String a)
	{
		aa=a;
		
		int start=0;
		int end=a.length()-1;
		while(start<=end)
		{
		if(a.charAt(start)!=a.charAt(end))
		{
			return false;
			
		}
		start++;
		end--;
		
	
		}
		return true;
		
}
	public static void checkStr(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			if(match(str[i]))
			{
				System.out.println("It is a pallendrome "+str[i]);
			}
			else
			{
				System.out.println("It is not a pallendrome"+str[i]);
			}
		}
		
	}
}
public class PalindromeMethodRefernce 
{
	public static void main(String[]args)
	{
		String[] strings= {"NooN","Sun","Car","Bus"};
		Palindrome palidrome=StringValidator::checkStr;
		palidrome.isPalindrome(strings);
		
		
	}

}






