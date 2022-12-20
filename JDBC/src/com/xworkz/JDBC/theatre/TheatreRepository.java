package com.xworkz.JDBC.theatre;

import java.util.ArrayList;

public interface TheatreRepository {
        ArrayList<TheatreDTO> save(TheatreDTO theatreDto);
        ArrayList<TheatreDTO> read(TheatreDTO theatreDto);
        
}
