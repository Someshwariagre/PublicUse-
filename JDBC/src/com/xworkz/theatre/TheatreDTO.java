package com.xworkz.theatre;

public class TheatreDTO {
	private String theatreName;
	private String location;
	private int noOfShows;
	private int noOfseats;
	private int ticketsAvailable;
	private int price;
	private String movieName;
	private String timings;
	private String movieLanguage;
	private int noOfPeople;
	
	public TheatreDTO() {
		System.out.println("By default constructor");
	}
	public TheatreDTO(String theatreName, String location, int noOfShows, int noOfseats, int ticketsAvailable,
			int price, String movieName, String timings, String movieLanguage, int noOfPeople) {
		super();
		this.theatreName = theatreName;
		this.location = location;
		this.noOfShows = noOfShows;
		this.noOfseats = noOfseats;
		this.ticketsAvailable = ticketsAvailable;
		this.price = price;
		this.movieName = movieName;
		this.timings = timings;
		this.movieLanguage = movieLanguage;
		this.noOfPeople = noOfPeople;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	public int getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	public int getTicketsAvailable() {
		return ticketsAvailable;
	}
	public void setTicketsAvailable(int ticketsAvailable) {
		this.ticketsAvailable = ticketsAvailable;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public void getMovieLanguage() {
		return;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public int getNoOfPeople() {
		return noOfPeople;
	}
	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	@Override
	public String toString() {
		return "TheatreDTO [theatreName=" + theatreName + ", location=" + location + ", noOfShows=" + noOfShows
				+ ", noOfseats=" + noOfseats + ", ticketsAvailable=" + ticketsAvailable + ", price=" + price
				+ ", movieName=" + movieName + ", timings=" + timings + ", movieLanguage=" + movieLanguage
				+ ", noOfPeople=" + noOfPeople + "]";
	}


}
