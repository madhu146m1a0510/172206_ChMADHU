package com.cg.imdb;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    String n=request.getParameter("username");  
	    String p=request.getParameter("password");  
	    if(LoginDAO.validate(n, p)){  
	       response.sendRedirect("comments.jsp");
	    }  
	    else{  
	        
	        RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	}

}

