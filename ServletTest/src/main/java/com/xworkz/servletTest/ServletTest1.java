package com.xworkz.servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/institute")

public class ServletTest1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		writer.print("<html>\r\n" + "    <head>\r\n" + "        <title></title>\r\n" + "        <style>\r\n"
				+ "            input{\r\n" + "                margin: 10px;\r\n" + "                padding: 10px;\r\n"
				+ "            }\r\n" + "        </style>\r\n" + "\r\n" + "    </head>\r\n" + "    <body>\r\n" + "        <div style=\"text-align: center;\">\r\n"
				+ "        <h1>Institute details</h1>\r\n" 
				+ "            <form action=\"institute\" method=\"post\">\r\n"
				+ "                <div><input type=\"text\" name=\"instituteName\" placeholder=\"instituteName\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"location\" placeholder=\"location\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"course\" placeholder=\"course\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"feesStructure\" placeholder=\"feesStructure\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"timing\" placeholder=\"timing\"></div>\r\n"
				+ "                <button type=\"submit\">Submit</button>\r\n" + "\r\n" + "            </form>\r\n"
				+ "        </div>\r\n" + "    </body>\r\n" + "</html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String instituteName = request.getParameter("instituteName");
		String location = request.getParameter("location");
		String course = request.getParameter("course");
		String feesStructure = request.getParameter("feesStructure");
		String timing = request.getParameter("timing");

		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		
		writer.println("InstituteName : " + instituteName);
		writer.println(",   location : " + location);
		writer.println(",   Course : " + course);
		writer.println(",   FeesStructure : " + feesStructure);
		writer.println(",   Timing : " + timing);

		System.out.println("InstituteName : " + instituteName);
		System.out.println("location : " + location);
		System.out.println("Course : " + course);
		System.out.println("FeesStructure : " + feesStructure);
		System.out.println("Timing : " + timing);

	}

}
