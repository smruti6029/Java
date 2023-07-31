package com.JDBC2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyEmployes {

	public static void tableCreatet() throws ClassNotFoundException, SQLException 
	{
		Connection con=JdbcConnection.createConnection();
		
		String q="create table employesdetalies(id int(20) primary key auto_increment,name varchar(200) not null,phone varchar(10),address varchar(200))";
	    Statement stmt=con.createStatement();
	    int s=stmt.executeUpdate(q);
	    System.out.println("Data base created");
	     
	
	}
}
