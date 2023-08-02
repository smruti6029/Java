package com.GetIDThrowManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ManagerDao.GetDetalisById;

public class GetDetalisWithId 
{
	public static void  GetDetalis () throws NumberFormatException, IOException
	{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Manager Id");
	int id=Integer.parseInt(bf.readLine());
//	GetDetalisById.getDetalis(id);
	GetDetalisById.getAllDetslis(id);
	GetDetalisWithId.GetDetalis();
	
	
	}
	
	

}
