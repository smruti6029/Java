package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Entity.Emp;
import com.service.GetAllEmployDetalis;
import com.service.GetResultByUserIdPassword;


@WebServlet("/all")
public class GetAllEmploy extends HttpServlet {

		
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
	
       List<Emp> allUser=GetAllEmployDetalis.getAllDetalis();
       PrintWriter out = resp.getWriter();
       System.out.println("");
       
       
       HttpSession session = req.getSession();
       
       if( allUser!= null && !allUser.isEmpty()) {
			resp.sendRedirect("employ.jsp");
			session.setAttribute("msg", "Your Colleagues");
			session.setAttribute("list", allUser);
			

						

		} else {
			session.setAttribute("msg", "You have no Colleagues");
			System.out.println("No Colleagues");
		}

    }
}
