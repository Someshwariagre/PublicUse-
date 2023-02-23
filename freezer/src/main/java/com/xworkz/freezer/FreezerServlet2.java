package com.xworkz.freezer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/servlet 2")

public class FreezerServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
//		writer.println("<div>Hi My Dear friend <div>");
//		writer.println("<div>this is from servlet 2</div>");
	}
}
