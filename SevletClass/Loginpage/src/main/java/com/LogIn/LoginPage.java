package com.LogIn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;

public class LoginPage  extends HttpServlet{
	
	
	public void service(HttpServletRequest req,XHttpServletResponse res) throws IOException
	{
		String user_id=req.getParameter("User_ID");
		String password=req.getParameter("Password");
	
		PrintWriter out=res.getWriter();
		out.println("Master");
		
	}

}
