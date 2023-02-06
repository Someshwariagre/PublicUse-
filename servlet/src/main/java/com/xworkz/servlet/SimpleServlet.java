package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value = "/server" )  
@WebInitParam(name= "mobile" , value = "samsung")

public class SimpleServlet extends HttpServlet {
	  
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		response.setContentType("mobile");
		
		
		PrintWriter print = response.getWriter();

		print.print("<html><body>");
		print.print("<h1> Hi servlet </h1>");
		print.print("</body></html>");
		
	}

}
