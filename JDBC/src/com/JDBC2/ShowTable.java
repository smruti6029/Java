package com.JDBC2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class ShowTable {
	public static ResultSet showTables()
	{
		try {
		Connection con=JdbcConnection.createConnection();
		String qry = "SELECT * FROM employesdetalies";
		Statement stmt = con.createStatement();
		
		ResultSet rst=stmt.executeQuery(qry);
		return rst ;
		}
		catch (Exception e)
		{
			System.out.println("No Table");
		}
		return null;
	}

}
