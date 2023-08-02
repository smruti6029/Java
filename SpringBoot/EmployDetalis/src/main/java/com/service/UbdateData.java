package com.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.DouEmploy.UpdateDataInTable;


public class UbdateData 
{

	public static void UpdateDateDataById() throws NumberFormatException, IOException 
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id to Ubdate your name");
        int id=Integer.parseInt(bf.readLine());
        System.out.println("Enter Name");
        String name=bf.readLine();
        UpdateDataInTable.UpdateDataInTable(id,name);
		
		
	}

}
