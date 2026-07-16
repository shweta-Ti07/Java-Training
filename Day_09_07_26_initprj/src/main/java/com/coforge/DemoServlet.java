package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
//@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//String url,userName,pwd;

    @Override
    public void init() throws ServletException {
    	
    	super.init();
//    	 url=getInitParameter("url");
//    	 userName=getInitParameter("username");
//    	 pwd=getInitParameter("password");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		ServletContext context=getServletContext();
		
		String url=context.getInitParameter("url");
		String userName=context.getInitParameter("username");
		String pwd=context.getInitParameter("password");
		
		ServletConfig config=getServletConfig();
		String servletName=config.getInitParameter("servletName");
		out.println("<h1>"+servletName+"</h1>");
		
		
		out.println("<h2>mysql db configuration");
		out.println("<br>mysql url : "+ url);
		out.println("<br>mysql username : "+userName);
		out.println("<br>mysql password : "+pwd);
		out.println("</h2>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
