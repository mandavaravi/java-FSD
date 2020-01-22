package com.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.loginClass;


public class loginServlet extends HttpServlet {
	String user,pass;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user = request.getParameter("UserName");
		pass = request.getParameter("Password");
		loginClass lc = new loginClass();
		lc.setUsername(user);
		lc.setPassword(pass);
		request.setAttribute(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "", lc);
		boolean status = lc.validate();
		
		if(status){  
            RequestDispatcher rd=request.getRequestDispatcher("success.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("loginerror.jsp");  
            rd.forward(request, response);  
        }  
	}

}
