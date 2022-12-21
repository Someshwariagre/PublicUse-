package com.xworkz.JDBC.theatre;

import java.util.ArrayList;
import java.util.HashSet;



public interface TheatreRepository {
        ArrayList<TheatreDTO> save(TheatreDTO theatreDto);
        ArrayList<TheatreDTO> findBy();
		ArrayList<TheatreDTO> read(TheatreDTO theatreDto);
       
      
       
		
		
        
}

