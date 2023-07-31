package com.Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Entity.*;
import com.service.InsertDataInTable;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String dobString = req.getParameter("dob");
        String password = req.getParameter("password");
        String emp_code=req.getParameter("emp_code");
        String phone =req.getParameter("phone");
        System.out.println(phone);


        Emp emp = new Emp(name, email, gender,  password,dobString,emp_code,phone);
        boolean flag= InsertDataInTable.insertIntable(emp);
        
        	HttpSession session = req.getSession();
		
		if(flag) {
			resp.sendRedirect("index.jsp");
			session.setAttribute("msg", "Employee Registred Successfully");
			System.out.println("Employee Registred Successfully");
		} else {
			session.setAttribute("msg", "Employee Registration Failed");
			System.out.println("Employee registration failed");
		}

       
       
    }
}
