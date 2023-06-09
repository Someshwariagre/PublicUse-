package com.xworkz.votercard;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.votercard.dto.VoterDto;
import com.xworkz.votercard.service.VoterService;
import com.xworkz.votercard.service.VoterServiceImpl;


@WebServlet(value = "/readAll")
public class VoterServletRead extends HttpServlet{
VoterService service = new VoterServiceImpl();
	
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<table>");
		
		List<VoterDto> list = service.readAll();
		for (VoterDto hospitalDto : list) {
			writer.print("<tr>");
			writer.print("<td> ");
			writer.print(hospitalDto.getName());
			writer.print("</td> ");
			
			writer.print("<td> ");
			writer.print(hospitalDto.getLocation());
			writer.print("</td>");
			 
		}
		
		writer.print("</form>" );
		
        
}
}
