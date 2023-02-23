package com.xworkz.servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/servlet 2")
public class ServletTest2 extends HttpServlet{
	
	

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		
//	     request.getRequestDispatcher("/servlet 3").forward(request, response);
	     
		PrintWriter writer = response.getWriter();
		writer.print("<div>This message is from servlet 2<div>");
		request.getRequestDispatcher("/servlet 3").include(request, response);
		writer.print("<div>Response came from servlet 3 and sending response <div>");
		
	
	}

}
