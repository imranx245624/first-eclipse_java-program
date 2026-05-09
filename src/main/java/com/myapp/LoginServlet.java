package com.myapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean found=false;
		for(User u:RegisterServlet.users)
		{
			if(u.username.equals(username) && u.password.equals(password))
			{
				
				found=true;
				break;
				
				
			}
		}
		if(found) {
			
			response.getWriter().println("login successfull");
		}
			
			else {
				
				response.getWriter().println("login failed");
			}
		
		
		
//		doGet(request, response);
	}

}
