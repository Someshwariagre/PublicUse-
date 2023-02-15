package com.xworkz.metro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/detail" )
public class MetroServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body>");
		writer.print("<form action = 'detail' method = 'post'>");
		writer.print("<div> name : <input type= 'text' name = 'name'></div");
		writer.print("<div> email  : <input type= 'email' name = 'email'></div>");
		writer.println("<div><button  type= 'submit' name = 'submit'> submit </button> </div> </form>");
		
		
		}
		
		public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
			 String name = request.getParameter("name");
			 String email = request.getParameter("email");
			 
			 response.setContentType("text/html");
			 
			
			PrintWriter writer = response.getWriter();
			
			writer.print("name : " + name);
			writer.print("email : " + email);
			
			System.out.println("name : " + name);
			System.out.println("email : " + email);
			
		}	

}
