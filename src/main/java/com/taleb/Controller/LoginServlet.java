package com.taleb.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import BD.ConnexionDB;

/**
 * Servlet implementation class FirstServlet
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		
		ConnexionDB db=new ConnexionDB();
		try {
			String med="BOUKOUCH";
			
			db.lire("SELECT * FROM admins WHERE email='" + email + "' AND password='" + password + "'");
			if (db.suivant()) {
				
				request.getRequestDispatcher("index.jsp").forward(request, response);
				System.out.println(email);
				System.out.println(email);
			}else {
				request.setAttribute("status", "faied");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
