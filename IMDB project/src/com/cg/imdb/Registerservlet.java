package com.cg.imdb;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet(description = "to insert data", urlPatterns = { "/Registerservlet" })
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registerservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String mobilenum = request.getParameter("mobilenum");

		String address = request.getParameter("address");
		boolean status = false;
		RegisterDAO u = new RegisterDAO();

		try {

			status = u.register(firstname,lastname,username, password, email,mobilenum,address);
			System.out.println(status);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (status == true) {
			response.sendRedirect("NewFile1.html");
		}
	}

}