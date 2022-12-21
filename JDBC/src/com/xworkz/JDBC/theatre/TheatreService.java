package com.xworkz.JDBC.theatre;

import java.util.ArrayList;

public interface TheatreService {
	 TheatreDTO save(TheatreDTO theatreDto);
	 TheatreDTO findBy(TheatreDTO theatreName);
     TheatreDTO read(TheatreDTO theatreDto );
     
	
}
