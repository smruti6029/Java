package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Student_Controller_Package.ConnectionDb;



public class StudentMarkDao {

	
	
	
	public static void tableCreatet() throws Exception 
	{
		Connection con=ConnectionDb.createConnection();
		String q = "CREATE TABLE student_mark ("
		         + "id INT(20) PRIMARY KEY AUTO_INCREMENT,"
		         + "student_code VARCHAR(200) UNIQUE,"
		         + "name VARCHAR(200) NOT NULL,"
		         + "english DOUBLE,"
		         + "math DOUBLE,"
		         + "bio DOUBLE,"
		         + "it DOUBLE,"
		         + "chem DOUBLE,"
		         + "phy DOUBLE"
		         + ")";
	    Statement stmt=con.createStatement();
	    stmt.executeUpdate(q);
	    System.out.println("Table Created created");
	}
	public static boolean updateStudentDetalis(String name, String code, double english, double math, double bio, double it, double chem,double phy) throws ClassNotFoundException, Exception 
	
	{
		Connection con=ConnectionDb.createConnection();
		String qry="Insert into student_mark(student_code,name,english,math,bio,it,chem,phy) values(?,?,?,?,?,?,?,?)";
		PreparedStatement pre=con.prepareStatement(qry);
		pre.setString(1,code);
		pre.setString(2,name);
		pre.setDouble(3, english);
		pre.setDouble(4, math);
		pre.setDouble(5, bio);
		pre.setDouble(6, it);
		pre.setDouble(7, chem);
		pre.setDouble(8, phy);
		double id=pre.executeUpdate();
		if(id!=0)
		{
			con.close();
			return true;
		}
		
		return false;
		
	}
	public static ResultSet GetValue(int id) 
	{
		
		try {
			Connection con=ConnectionDb.createConnection();
			String qry = "SELECT * FROM student_mark WHERE student_code = "+id;
			Statement stmt = con.createStatement();
			
			ResultSet rst=stmt.executeQuery(qry);
			return rst ;
			}
			catch (Exception e)
			{
				System.out.println("No data ");
			}
			return null;
		
	}
	public static int updateStudentMark(String code, double english, double math, double bio, double it,
			double chem, double phy) throws ClassNotFoundException, Exception 
	{
		Connection con=ConnectionDb.createConnection();	
		Statement statement = con.createStatement();
		String updateQuery = "UPDATE student_mark " +
				"SET english = " + english + ", math = " + math + ", bio = " + bio +
				", it = " + it + ", chem = " + chem + ", phy = " + phy +
				" WHERE student_code = " + code;
		 int rowsUpdated = statement.executeUpdate(updateQuery);
		
		
		
		
		
		
		return rowsUpdated;
	}
	public static ResultSet GetAllValue() throws ClassNotFoundException, Exception {
		Connection con=ConnectionDb.createConnection();
		try {
			Connection con1=ConnectionDb.createConnection();
			String qry = "SELECT * FROM student_mark;";
			Statement stmt = con1.createStatement();
			
			ResultSet rst=stmt.executeQuery(qry);
			return rst ;
			}
			catch (Exception e)
			{
				System.out.println("No data ");
			}
			return null;
			
	}

}
