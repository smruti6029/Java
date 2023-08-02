package com.adduserdetais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.DAO_FOR_MCQ.DataInsert;
import com.mcq.entity.UsersInputClass;


public class AddUserDetalis {

	public static void addUser() throws IOException 
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name=bf.readLine();
		System.out.println("Enter gmail");
		String gmail=bf.readLine();
		UsersInputClass user=new UsersInputClass();
		
		user.setEmail(gmail);
		user.setName(name);
		DataInsert.addUser(user);
		
	}

}