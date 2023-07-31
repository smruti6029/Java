package com.CheckUserDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class AdminLogin extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		PrintWriter out = res.getWriter();
				
		if(name.equals(new String("Smruti Ranjan Nayak"))) {
			if(password.equals(new String("Smruti@123"))) {
				res.setContentType("text/html");
				out.println("<h1> Welcome MR :"+name+" </h1>");
			}
			else
			{
				res.setContentType("text/html");
				out.println("<h1> Invalid User"+ "</h1>");
			}
		} else {
			res.setContentType("text/html");
			out.println("<h1> Invalid User"+ "</h1>");
		}
	}
}
