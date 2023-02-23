package com.xworkz.hospital1;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.hospital1.dto.HospitalDto;
import com.xworkz.hospital1.service.Hospital1Service;
import com.xworkz.hospital1.service.Hospital1ServiceImpl;

@WebServlet(value = "/save")
public class Hospital1Servlet extends HttpServlet {

	Hospital1Service service = new Hospital1ServiceImpl();
	
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
		
			request.getRequestDispatcher("/readAll").include(request, response);
			
		
		PrintWriter writer = response.getWriter();
		
		
		writer.print("<html>\r\n" + "    <head>\r\n" + "        <title></title>\r\n" + "        <style>\r\n"
				+ "            input{\r\n" + "                margin: 10px;\r\n" + "                padding: 10px;\r\n"
				+ "            }\r\n" + "        </style>\r\n" + "\r\n" + "    </head>\r\n" + "    <body>\r\n"
				+ "        <h1>Hospital details</h1>\r\n" + "        <div style=\"text-align: center;\">\r\n"
				+ "            <form action=\"save\" method=\"post\">\r\n"
				+ "                <div><input type=\"text\" name=\"name\" placeholder=\"Name\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"location\" placeholder=\"Location\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"noOfDoctors\" placeholder=\"No of Doctors\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"specailization\" placeholder=\"specailization\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"noOfWard\" placeholder=\"No of ward\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"ratings\" placeholder=\"ratings\"></div>\r\n"
				+ "                <button type=\"submit\">Submit</button>\r\n" + "\r\n" + "            </form>\r\n"
				+ "        </div>\r\n" + "    </body>\r\n" + "</html>");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse response) throws ServerException, IOException {
		String name = req.getParameter("name");
		String location = req.getParameter("location");
		String noOfDoctors = req.getParameter("noOfDoctors");
		String specailization = req.getParameter("specailization");
		String noOfWard = req.getParameter("noOfWard");
		String ratings = req.getParameter("ratings");

		HospitalDto dto = new HospitalDto(name, location, noOfDoctors, specailization, noOfWard, ratings);
		String status = service.save(dto);
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		writer.print(status);

	}
}
