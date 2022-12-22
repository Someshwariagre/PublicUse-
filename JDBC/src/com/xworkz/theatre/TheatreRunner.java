package com.xworkz.theatre;

import java.util.ArrayList;

import com.xworkz.service.TheatreService;
import com.xworkz.service.TheatreServiceIMPL;

public class TheatreRunner {
	public static void main(String[] args) {
		
TheatreService theatreservice = new TheatreServiceIMPL();

TheatreDTO miraz = new TheatreDTO();
miraz.setTheatreName("Miraz");
miraz.setLocation("Gulbarga");
miraz.setNoOfShows(6);
miraz.setNoOfseats(430);
miraz.setTicketsAvailable(300);
miraz.setPrice(180);
miraz.setMovieName("Pushpa");
miraz.setTimings("6:00 PM");
miraz.setMovieLanguage("Telagu");
miraz.setNoOfPeople(400);

TheatreDTO shetty = new TheatreDTO();
shetty.setTheatreName("Shetty");
shetty.setLocation("Gulbarga");
shetty.setNoOfShows(5);
shetty.setNoOfseats(300);
shetty.setTicketsAvailable(250);
shetty.setPrice(200);
shetty.setMovieName("Love mocktail 2");
shetty.setTimings("12:00 PM");
shetty.setMovieLanguage("Kannada");
shetty.setNoOfPeople(280);

TheatreDTO chitra = new TheatreDTO();
chitra.setTheatreName("Chitra");
chitra.setLocation("Belgaum");
chitra.setNoOfShows(8);
chitra.setNoOfseats(450);
chitra.setTicketsAvailable(400);
chitra.setPrice(280);
chitra.setMovieName("Vikrant Rona");
chitra.setTimings("10:00 PM");
chitra.setMovieLanguage("Kannada");
chitra.setNoOfPeople(400);

TheatreDTO naratki = new TheatreDTO();
naratki.setTheatreName("Naratki");
naratki.setLocation("Belgaum");
naratki.setNoOfShows(5);
naratki.setNoOfseats(500);
naratki.setTicketsAvailable(450);
naratki.setPrice(450);
naratki.setMovieName("KGF2");
naratki.setTimings("9:00 AM");
naratki.setMovieLanguage("Kannada");
naratki.setNoOfPeople(450);

TheatreDTO santosh = new TheatreDTO();
santosh.setTheatreName("Santosh");
santosh.setLocation("Bengaluru");
santosh.setNoOfShows(7);
santosh.setNoOfseats(450);
santosh.setTicketsAvailable(400);
santosh.setPrice(380);
santosh.setMovieName("Avatar2");
santosh.setTimings("7:00 PM");
santosh.setMovieLanguage("English");
santosh.setNoOfPeople(380);

ArrayList<TheatreDTO> theatres = new ArrayList<TheatreDTO>();
TheatreDTO inox = new TheatreDTO("Sangam","Gulbarga",5,400,350,380,"Avatar2","7:00 AM","English",380);
TheatreDTO victoriya = new TheatreDTO("Victoriya","Bengaluru",7,290,250,400,"Charli","7:00 PM","Kannada",200);
TheatreDTO netravati = new TheatreDTO("Netravati","Bengaluru",6,300,380,250,"Bhrmastra","9:00 PM","Hindi",300);
TheatreDTO mukta = new TheatreDTO("Mukta","Gulbarga",7,340,380,280,"Druvatare","5:00 PM","kannada",400);
TheatreDTO srs = new TheatreDTO("SRS","Hubbali",4,300,280,350,"Yajamana","8:00 PM","kannada",300);
TheatreDTO bigcinemas = new TheatreDTO("Bigcinemas","Dharwad",6,380,350,180,"Badavarascal","9:00 AM","Kannada",200);
TheatreDTO esquare = new TheatreDTO("Esquare","Bidar",4,300,260,200,"Pailwan","7:00 PM","Kannada",290);
TheatreDTO pvr = new TheatreDTO("PVR","Chikkmanguluru",6,320,300,250,"Ashique2","10:00 AM","Hindi",300);
TheatreDTO cinipolis = new TheatreDTO("Cinipolis","Belgaum",4,500,490,400,"Sita Ramam","11:30 AM","Telagu",400);
TheatreDTO sathyam = new TheatreDTO("Sathyam","Gadag",6,250,240,190,"Vikram Vedam","11:35 AM","Telagu",200);

theatreservice.save(sathyam);
theatreservice.save(cinipolis);
theatreservice.save(pvr);
theatreservice.save(esquare);
theatreservice.save(bigcinemas);
theatreservice.save(srs);
theatreservice.save(mukta);
theatreservice.save(netravati);
theatreservice.save(victoriya);
theatreservice.save(inox);
theatreservice.save(santosh);
theatreservice.save(naratki);
theatreservice.save(chitra);
theatreservice.save(shetty);
theatreservice.save(miraz);

theatres.add(esquare);
theatres.add(bigcinemas);
theatres.add(netravati);
theatres.add(shetty);
theatres.add(sathyam);
theatres.add(cinipolis);
theatres.add(pvr);
theatres.add(srs);
theatres.add(mukta);
theatres.add(victoriya);
theatres.add(inox);
theatres.add(santosh);
theatres.add(naratki);
theatres.add(chitra);
theatres.add(miraz);


     ArrayList<TheatreDTO> dto = theatreservice.read();
   for (TheatreDTO theatreDTO : dto) {
	   System.out.println(theatreDTO);	
}


  theatreservice.findBy("Naratki");

	   
}
 

	}

