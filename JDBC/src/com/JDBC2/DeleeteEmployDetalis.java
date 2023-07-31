package com.JDBC2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleeteEmployDetalis {
	public static boolean deleateEmploy(int input2) throws Exception
	{
		Connection con=JdbcConnection.createConnection();
		String qry="DELETE FROM employesdetalies WHERE id = ?";
		 PreparedStatement pre = con.prepareStatement(qry);
		    pre.setInt(1,input2);
		    int rowsAffected = pre.executeUpdate();

		    return rowsAffected > 0;
		}

}
