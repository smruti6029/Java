package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Entity.Emp;
import com.service.GetResultByUserIdPassword;


@WebServlet("/RA")
public class SignupCLass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String email = req.getParameter("email");
 
        String password = req.getParameter("password");
       
        System.out.println(email);
        System.out.println(password);
   
       Emp user= GetResultByUserIdPassword.getUserdetalis(email,password);

		
       	resp.setContentType("text/html");	
		HttpSession session = req.getSession();
	
		if(user.getPassword().equals(password) 		) {
			resp.sendRedirect("user.jsp");
			session.setAttribute("msg", "Logged in Successfully");
			session.setAttribute("name", user.getName());
			session.setAttribute("gender", user.getGender());
			session.setAttribute("email", user.getEmail());
		

		} else {
			resp.sendRedirect("index.jsp");
			System.out.println("Login failed");
		}
			
       
    }

}
