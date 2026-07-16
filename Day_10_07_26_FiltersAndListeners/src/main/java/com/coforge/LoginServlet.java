package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		if(uname.equals("swapna")&& pwd.equals("swapna123")) {
			
			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("home.jsp");
		}
		else
			response.sendRedirect("error.jsp");
	
	}

	

}
