package com.xworkz.servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/servlet 3")
public class ServletTest3 extends HttpServlet{
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("<div>My name is someshwari<div>");
		writer.println("<div>This is from servlet 3</div>");
	}

}
