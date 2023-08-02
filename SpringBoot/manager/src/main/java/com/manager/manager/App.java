package com.manager.manager;

import com.GetIDThrowManager.GetDetalisWithId;
import com.datainsert.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	
    public static void main( String[] args ) throws NumberFormatException, IOException
    {

    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
    	while(true)
    	{
    		System.out.println("Enter 1 for insert data ");
    		System.out.println("Enter 2 for Get detalis of manager");
    		System.out.println("enter 3 for Break");
    		
    		int input=Integer.parseInt(bf.readLine());
    		if(input==1)
    		{
    			DataInsertIntable.dataInsert();
    		}
    		if(input==2){
    			{
    				GetDetalisWithId .GetDetalis();
    				
    			}
    		}
    		if(input==3)
    		{
    			break;
    		}
    		
    	}
		
    	
    }
}
