package com.Final;

class Final
{
	static int num=1234;
	final static String id;
	static private  Final obj=null;
	static 
	{
		id="OD 05";
	
		
	}
	static Final getInstance()
	{
	if(obj==null)
	{
		obj=new Final();
	}
	return obj;
	}
}

public class UsingFinalToGenerateId {

	public static void main(String[] args) {
		 Final obj=Final.getInstance();
		 System.out.println("Get unique Id ");
		 for(int i=0;i<50;i++)
		 {
		 System.out.println("Unique id ="+obj.id+" "+Final.num);
		 Final.num++;
		 }
		
		System.out.println(obj.id);
		System.out.println(Final.num);

	}

}
