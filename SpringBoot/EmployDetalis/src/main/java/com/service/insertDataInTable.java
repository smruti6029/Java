package com.service;

import com.DouEmploy.InsertDataInTable;
import com.entity.Employes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class insertDataInTable {

	public static Employes insertDataInTable() throws IOException 
	
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employ Detalis Like \n Name \n address \n Emp_code");
		String name=bf.readLine();
		String address=bf.readLine();
		String emp_code=bf.readLine();
		InsertDataInTable.InsertDataInTable(new Employes(name,address,emp_code));
		
		
		
		return null;
	}

}
