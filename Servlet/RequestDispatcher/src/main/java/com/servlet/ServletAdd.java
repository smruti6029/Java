package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAdd  extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		PrintWriter out = res.getWriter();
		
		int sum=num1+num2;
		out.println("<h1>Sum Of "+num1+"+"+num2+" :"+sum+" </h1>");
		req.setAttribute("sum", sum);
		RequestDispatcher rd=req.getRequestDispatcher("mul");
				
		rd.forward(req, res);
		
		
	}
}