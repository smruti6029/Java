//Using the concepts of final, static, singleton, and different access modifiers, 
//how would you implement the automatic generation and accessibility of a unique identification 
//number for each engine created in the car manufacturing application?

package com.Final;
import java.util.*;

class CarUniqueId
{
	String letter;
	static int number=12321;
	static int number1=65;
	
	static private CarUniqueId obj=null;
	
	public final String geneRate(String letter)
	{
		this.letter=letter;
		String id;
		number++;
		number1++;
		char letter2=(char)number1;
		String str=String.valueOf(letter2);
		id=letter.substring(0,1)+str+number+letter.substring(1,2);
		if(number==90)
		{
			number=65;
		}
		return id;		
	}
	protected static CarUniqueId getInstance()
	{
		if(obj==null)
		{
			obj=new CarUniqueId();
		}
		return obj;
		}
	}


public class GenerateUniqueId {

	public static void main(String[] args) {
		
		CarUniqueId  obj=CarUniqueId .getInstance();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Generate New Number Press 1 , 2 For Exit : ");
			int no=sc.nextInt();
			if(no==1)
			{
				System.out.println("Enter Model");
				
				String Model=sc.next();
				System.out.println("THE GENERATE NEW ID = "+obj.geneRate(Model));
				
			}
			else if(no==2)
			{
				break;
			}
			else
			{
				System.out.println("                         ");
				
				System.out.println("Invalid Input Enter Correct Number");
				System.out.println();
			}
			}
	
//		
//		System.out.println("THE GENERATE NEW ID = "+obj.geneRate());
//		System.out.println("THE GENERATE NEW ID = "+obj.geneRate());
//		System.out.println("THE GENERATE NEW ID = "+obj.geneRate());


	}

}
//OUTPUT-
//THE GENERATE ID = H2I 124B
//THE GENERATE ID = H2I 125C
//THE GENERATE ID = H2I 126D
//THE GENERATE ID = H2I 127E


//WHEN THE CarUniqueId OBJECT THROW CALL THE GENERATE() FUNCTION FIRST OF ALL NUMBER WILL BE INCREMENT THEN THE INCREMENT WILL STORE
//IN STRING VARIBLE THEN ANOTHER TIME WHEN YOU CALL THE GENERATE FUNCTION CALL THAT TIME NUMBER WILL IN STATIC FORMAT IT WILL STORE THE
////LAST VALUE SO THE NUMBER WILL BE ALWAYS DIFFERENT
//








