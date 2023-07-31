package com.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.PreparedQuery;

public class StudentDaO {
//	static boolean result=false;

	public static boolean createStudent(Student student) throws Exception 
	{
		Connection con=ConnectionJdbc.createConnection();
		String qry="Insert into student(name,address) values(?,?)";
		PreparedStatement pre=con.prepareStatement(qry);
		pre.setString(1,student.getName());
		pre.setString(2,student.getAddress());
		int id=pre.executeUpdate();
		if(id!=0)
		{
			return true;
		}
		
		return false;
	}

	public static ResultSet getAllvalues() throws  Exception 
	{
		Connection con=ConnectionJdbc.createConnection();
		String qry = "SELECT * FROM student";
		Statement stmt = con.createStatement();
		
		ResultSet rs=stmt.executeQuery(qry);
		return rs ;
	}

	public static boolean deleateStudent(int input2) throws Exception
	{
		Connection con=ConnectionJdbc.createConnection();
		String qry="DELETE FROM student WHERE id = ?";
		 PreparedStatement pre = con.prepareStatement(qry);
		    pre.setInt(1,input2);
		    int rowsAffected = pre.executeUpdate();
//		    System.out.println(rowsAffected);
		    return rowsAffected > 0;
		}

	public static boolean updateStudent(int id,String name,String address) throws Exception 
	{
		
		Connection con = ConnectionJdbc.createConnection();
	    String qry = "UPDATE student SET name = ?, address = ? WHERE id = ?";
	    PreparedStatement pre = con.prepareStatement(qry);
	    
	    pre.setString(1, name); // Replace with the updated name
	    pre.setString(2, address);
	    pre.setInt   (3,id); // Replace with the updated address
	    // Replace with the student ID to update
	    
	    int rowsAffected = pre.executeUpdate();
	    return rowsAffected > 0;
	}
	
		
		
	}
	


