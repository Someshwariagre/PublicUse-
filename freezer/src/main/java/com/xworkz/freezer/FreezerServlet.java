package com.xworkz.freezer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/servlet 1")

public class FreezerServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		
	     request.getRequestDispatcher("/servlet 2").forward(request, response);
	     
		PrintWriter writer = response.getWriter();
		writer.print("<div>this message is from servlet 1<div>");
//		request.getRequestDispatcher("/servlet 2").include(request, response);
		writer.print("<div>response came from servlet 2 and sending response <div>");
		
	
	}
}
