package com.hybernate.demo.EmployDetalis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.service.insertDataInTable;
import com.service.GetAllData;
import com.service.UbdateData;

public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         
        while(true)
        {
        	System.out.println("Enter 1 to Insert Value");
        	System.out.println("Enter 2 to ubdate by id");
        	System.out.println("Enter 3 to GetAll the Data");
        	int input=Integer.parseInt(bf.readLine());
        	{
        		if(input==1)
        		{
        			insertDataInTable.insertDataInTable();
        		}
        	}
        	if(input==2)
        	{
        		
        		
        		UbdateData.UpdateDateDataById();
        	}
        	if(input==3)
        	{
        		GetAllData.getAlldata();
        	}
        	if(input==5)
        	{
        		System.out.println("Thank You");
        		break;
        	}
        }
        
        
    }
}
