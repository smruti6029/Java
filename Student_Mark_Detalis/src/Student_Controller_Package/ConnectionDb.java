package Student_Controller_Package;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {

		static public Connection createConnection() throws ClassNotFoundException, Exception
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		String username="root";
		String password="Master@9776";
		String url="jdbc:mysql://localhost:3306/Student_mark";
		con=DriverManager.getConnection(url,username,password);
		
		return con;
		}
	}
