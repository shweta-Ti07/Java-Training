package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<h1>First Servlet</h1>");
		String uname=request.getParameter("name");
		System.out.println(uname);
		out.println("Name:"+uname);
		
		//request.setAttribute("name", name);
		
//		Cookie cookie=new Cookie("username", uname);
//		response.addCookie(cookie);
			
//		out.println("<a href=SecondServlet?username="+ uname +">Move to second servlet</a>");
		
		out.println("<form action=SecondServlet >");
		out.println("<input type=hidden name=username value= "+uname+">");
		out.println("<button>Move To Second Servlet</button>");
		
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
