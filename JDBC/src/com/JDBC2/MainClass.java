package com.JDBC2;
import java.io.InputStreamReader;
import java.sql.ResultSet;



import java.io.BufferedReader;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter 1 to Create Table");
			System.out.println("Enter 2 to Show Table");
			System.out.println("Enter 3 to Ubdate ");
			System.out.println("Enter 4 to Delete ");
			int input=Integer.parseInt(br.readLine());
			if(input==1)
			{
				InsertEmployDetalis.InsertEmployDetalis();
			}
			if(input==2)
			{
				ResultSet Set=ShowTable.showTables();
				if(Set!=null)
				{
				while(Set.next())
				{
					System.out.println();
				int id=Set.getInt(1);
				String name=Set.getString(2);
				String phone=Set.getString(3);
				String address=Set.getString(4);
				System.out.println("The Employ ID      :"+id);
				System.out.println("The Employ Name    :"+name);
				System.out.println("The Employ phone   :"+phone);
				System.out.println("The Employ Address :"+address);
				System.out.println("----------------------------------");
				
				}
				}
					
			}
			if(input==3)
			{
				System.out.println("Enter id to ubdate ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter Name");
				String name=br.readLine();
				System.out.println("Enter Phone NUmber");
				String phone=br.readLine();
				System.out.println("Enter Address");
				String addreass=br.readLine();
				boolean result=UbdateDetalis.updateStudent(id, name, addreass, phone);
				if(result)
				{
					System.out.println("Updated Success");
				}
				else
				{
					System.out.println("UpdatedFalid");
				}
				
			}
			if(input==4)
				{
					System.out.println("Enter Employ Id to deleete");
					int input2=Integer.parseInt(br.readLine());
					boolean delete=DeleeteEmployDetalis.deleateEmploy(input2);
					if(delete)
					{
						System.out.println("Deleted Succesfully");
					}
					else
					{
						System.out.println("Delete Falid");
						System.out.println("There Is No Student in"+input);
					
					}
				}
			if(input==5)
			{
				break;
			}
			if(input>5 && input<0)
			{
				System.out.println("ENter valid input");
			}
		}
		
	}

}
