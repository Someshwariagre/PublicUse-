package com.xworkz.hospital1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.hospital1.dto.HospitalDto;
import com.xworkz.hospital1.service.Hospital1Service;
import com.xworkz.hospital1.service.Hospital1ServiceImpl;
@WebServlet(value = "/readAll")
public class ReadServlet extends HttpServlet {
Hospital1Service service = new Hospital1ServiceImpl();
	
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<table>");
		
		List<HospitalDto> list = service.readAll();
		for (HospitalDto hospitalDto : list) {
			writer.print("<tr>");
			writer.print("<td> ");
			writer.print(hospitalDto.getName());
			writer.print("</td> ");
			
			writer.print("<td> ");
			writer.print(hospitalDto.getLocation());
			writer.print("</td>");
			
			writer.print("<td> ");
			writer.print(hospitalDto.getNoOfDoctors());
			writer.print("</td> ");
			
			writer.print("<td> ");
			writer.print(hospitalDto.getNoOfWard());
			writer.print("</td> ");
			
			writer.print("<td> ");
			writer.print(hospitalDto.getSpecailization());
			writer.print("</td>");
			
			writer.print("<td> ");
			writer.print(hospitalDto.getRatings());
			writer.print("</td>");
			writer.print("</tr>");
			
		}
		
		writer.print("</form>" );
		
        
}
}
