package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMul extends  HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int mul=num1*num2;
		
		int sum=(int) req.getAttribute("sum");
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1> The Multipication Of  "+num1 +"  "+num2 +" is " +mul+" </h1>");
		
		out.println("<h1> The addition Of  "+num1 +"  "+num2 +" is " +sum+" </h1>");
		
		
		
		
		
		
		
	}

}
