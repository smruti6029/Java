package com.JDBC2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Jdbc.ConnectionJdbc;

public class UbdateDetalis {
	public static boolean updateStudent(int id,String name,String address,String phone) throws Exception 
	{
		
		Connection con=JdbcConnection.createConnection();
	    String qry = "UPDATE employesdetalies SET name = ?, phone=?, address = ? WHERE id = ?";
	    PreparedStatement pre = con.prepareStatement(qry);
	    
	    pre.setString(1, name); // Replace with the updated name
	    pre.setString(2, phone);
	    pre.setString(3, address);
	    pre.setInt   (4,id); 
	    
	    
	    int rowsAffected = pre.executeUpdate();
	    return rowsAffected > 0;
	}

}
