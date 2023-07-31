package com.JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	static public Connection createConnection() throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con;
	String username="root";
	String password="password";
	String url="jdbc:mysql://localhost:3306/employes";
	con=DriverManager.getConnection(url,username,password);
	
	return con;
	}
	

}
