package com.JDBC2;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployDetalis {

	public static 	void InsertEmployDetalis() throws ClassNotFoundException, Exception 
	{
		Connection con=JdbcConnection.createConnection();
		String qry="Insert into employesdetalies(name,phone,address) values(?,?,?)";
		PreparedStatement pre=con.prepareStatement(qry);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name=input.readLine();
		System.out.println("Enter address");
		String address=input.readLine();
		System.out.println("Enter Teliphone Number");
		String phone=input.readLine();
		pre.setString(1,name);
		pre.setString(2, address);
		pre.setString(3,phone);
	
		int id=pre.executeUpdate();
		if(id>0)
		{
		System.out.println("Insert Employ Detalis");
		}
		else
		{
			System.out.println("Insert Falid");
		}
		

	}

}
